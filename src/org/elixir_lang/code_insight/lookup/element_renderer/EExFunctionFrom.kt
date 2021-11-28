package org.elixir_lang.code_insight.lookup.element_renderer

import com.intellij.codeInsight.lookup.LookupElement
import com.intellij.codeInsight.lookup.LookupElementPresentation
import com.intellij.codeInsight.lookup.LookupElementRenderer
import org.elixir_lang.psi.call.Call

class EExFunctionFrom(val name: String) : LookupElementRenderer<LookupElement>() {
    override fun renderElement(element: LookupElement, lookupElementPresentation: LookupElementPresentation) {
        lookupElementPresentation.itemText = name
        lookupElementPresentation.isItemTextBold = true

        val eexFunctionFrom = element.psiElement?.let { it as? Call }?.let { org.elixir_lang.structure_view.element.EExFunctionFrom.fromCall(it) }

        if (eexFunctionFrom != null) {
            val itemPresentation = eexFunctionFrom.children.first().presentation

            lookupElementPresentation.putItemPresentation(itemPresentation)
        }
    }
}
