package org.elixir_lang.mix

import com.intellij.execution.Executor
import com.intellij.execution.configuration.EnvironmentVariablesComponent
import com.intellij.execution.configurations.*
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.RunConfigurationWithSuppressedDefaultRunAction
import com.intellij.openapi.options.SettingsEditor
import com.intellij.openapi.project.Project
import com.intellij.psi.search.GlobalSearchScope
import org.elixir_lang.Mix
import org.elixir_lang.debugged.Modules
import org.elixir_lang.debugger.configuration.Debuggable
import org.elixir_lang.mix.configuration.Editor
import org.elixir_lang.run.*
import org.elixir_lang.run.Configuration
import org.jdom.Element

/**
 * https://github.com/ignatov/intellij-erlang/blob/master/src/org/intellij/erlang/rebar/runner/RebarRunConfigurationBase.java
 */
open class Configuration(name: String, project: Project, configurationFactory: ConfigurationFactory) :
        Configuration(name, project, configurationFactory),
        Debuggable<org.elixir_lang.mix.Configuration>,
        RunConfigurationWithSuppressedDefaultRunAction,
        RunConfigurationWithSuppressedDefaultDebugAction {
    override fun debuggerConfiguration(name: String, configPath: String, javaPort: Int): org.elixir_lang.debugger.Configuration {
        val debugger = org.elixir_lang.debugger.Configuration(name, project, factory)
        debugger.erlArgumentList.addAll(erlArgumentList)
        debugger.erlArgumentList.addAll(arrayOf("-name", name))
        debugger.erlArgumentList.addAll(arrayOf("-config", configPath))

        debugger.elixirArgumentList.addAll(elixirArgumentList)

        debugger.javaPort = javaPort

        debugger.workingDirectory = workingDirectory
        debugger.isPassParentEnvs = isPassParentEnvs
        debugger.envs = envs
        debugger.configurationModule.module = configurationModule.module

        return debugger
    }

    override fun debuggedConfiguration(name: String, configPath: String): org.elixir_lang.mix.Configuration {
        val debugged = org.elixir_lang.mix.Configuration(this.name, project, factory)

        debugged.erlArgumentList.addAll(erlArgumentList)
        debugged.erlArgumentList.addAll(arrayOf("-name", name))
        debugged.erlArgumentList.addAll(arrayOf("-config", configPath))
        debugged.erlArgumentList.addAll(Modules.erlArgumentList())

        debugged.elixirArgumentList.addAll(elixirArgumentList)

        debugged.mixArgumentList.addAll(mixArgumentList)

        debugged.workingDirectory = workingDirectory
        debugged.isPassParentEnvs = isPassParentEnvs
        debugged.envs = envs
        debugged.configurationModule.module = configurationModule.module

        return debugged
    }

    override fun getProgramParameters(): String? = mixArguments

    override fun setProgramParameters(value: String?) {
        mixArguments = value
    }

    private var erlArgumentList: MutableList<String> = mutableListOf()

    var erlArguments: String?
        get() = erlArgumentList.toArguments()
        set(arguments) = erlArgumentList.fromArguments(arguments)

    private var elixirArgumentList: MutableList<String> = mutableListOf()

    var elixirArguments: String?
        get() = elixirArgumentList.toArguments()
        set(arguments) = elixirArgumentList.fromArguments(arguments)

    private var mixArguments: String?
        get() = mixArgumentList.toArguments()
        set(arguments) = mixArgumentList.fromArguments(arguments)

    private var mixArgumentList: MutableList<String> = mutableListOf()

    fun commandLine(): GeneralCommandLine {
        val workingDirectory = ensureWorkingDirectory()
        val module = ensureModule()
        val sdk = ensureMostSpecificSdk(module)
        val commandLine = Mix.commandLine(envs, workingDirectory, sdk, erlArgumentList, elixirArgumentList)
        commandLine.addParameters(mixArgumentList)

        return commandLine
    }

    override fun getConfigurationEditor(): SettingsEditor<out RunConfiguration> = Editor()

    /**
     * getModules changed to getSearchScope in
     * https://github.com/JetBrains/intellij-community/commit/4daac1c8cdb0cb98bbb26df7d4900c766626a742#diff-5fa0d6d7f6e6058e338ccec4efdb4596,
     * which affects IntelliJ 2016.*
     *
     * @return scope where to search sources for this configuration
     */
    override fun getSearchScope(): GlobalSearchScope? {
        return GlobalSearchScope.projectScope(project)
    }

    override fun getState(executor: Executor, environment: ExecutionEnvironment): RunProfileState =
            State(environment, this)

    override fun readExternal(element: Element) {
        super.readExternal(element)
        element.readExternalArgumentList(ERL, erlArgumentList)
        element.readExternalArgumentList(ELIXIR, elixirArgumentList)
        element.readExternalArgumentList(MIX, mixArgumentList)
        workingDirectoryURL = element.readExternalWorkingDirectory()
        EnvironmentVariablesComponent.readExternal(element, envs)
        element.readExternalModule(this)
    }

    override fun writeExternal(element: Element) {
        super.writeExternal(element)
        element.writeExternalArgumentList(ERL, erlArgumentList)
        element.writeExternalArgumentList(ELIXIR, elixirArgumentList)
        element.writeExternalArgumentList(MIX, mixArgumentList)
        element.writeExternalWorkingDirectory(workingDirectoryURL)
        EnvironmentVariablesComponent.writeExternal(element, envs)
        element.writeExternalModule(this)
    }
}
