package org.elixir_lang.annotator;


import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

public class ModuleAttributeTest extends LightCodeInsightFixtureTestCase {
    /*
     * Tests
     */

    /**
     * See https://github.com/KronicDeth/intellij-elixir/issues/413
     */
    public void testIssue413() {
        myFixture.configureByFiles("typespec_test.exs");
        myFixture.checkHighlighting(false, false, true);
    }

    /*
     * Protected Instance Methods
     */

    @Override
    protected String getTestDataPath() {
        return "testData/org/elixir_lang/annotator/module_attribute";
    }
}
