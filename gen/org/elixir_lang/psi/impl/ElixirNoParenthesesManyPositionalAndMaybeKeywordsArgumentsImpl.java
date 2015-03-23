// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import org.elixir_lang.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ElixirNoParenthesesManyPositionalAndMaybeKeywordsArgumentsImpl extends ASTWrapperPsiElement implements ElixirNoParenthesesManyPositionalAndMaybeKeywordsArguments {

  public ElixirNoParenthesesManyPositionalAndMaybeKeywordsArgumentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitNoParenthesesManyPositionalAndMaybeKeywordsArguments(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ElixirAlias> getAliasList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirAlias.class);
  }

  @Override
  @NotNull
  public List<ElixirAtNumericOperation> getAtNumericOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirAtNumericOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirAtom> getAtomList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirAtom.class);
  }

  @Override
  @NotNull
  public List<ElixirAtomKeyword> getAtomKeywordList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirAtomKeyword.class);
  }

  @Override
  @NotNull
  public List<ElixirCaptureNumericOperation> getCaptureNumericOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirCaptureNumericOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirCharListHeredoc> getCharListHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirCharListHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirCharListLine> getCharListLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirCharListLine.class);
  }

  @Override
  @NotNull
  public List<ElixirCharToken> getCharTokenList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirCharToken.class);
  }

  @Override
  @NotNull
  public List<ElixirEmptyBlock> getEmptyBlockList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirEmptyBlock.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedCharListSigilHeredoc> getInterpolatedCharListSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedCharListSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedCharListSigilLine> getInterpolatedCharListSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedCharListSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedRegexHeredoc> getInterpolatedRegexHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedRegexHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedRegexLine> getInterpolatedRegexLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedRegexLine.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedSigilHeredoc> getInterpolatedSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedSigilLine> getInterpolatedSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedStringSigilHeredoc> getInterpolatedStringSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedStringSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedStringSigilLine> getInterpolatedStringSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedStringSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedWordsHeredoc> getInterpolatedWordsHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedWordsHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirInterpolatedWordsLine> getInterpolatedWordsLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirInterpolatedWordsLine.class);
  }

  @Override
  @NotNull
  public List<ElixirList> getListList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirList.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralCharListSigilHeredoc> getLiteralCharListSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralCharListSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralCharListSigilLine> getLiteralCharListSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralCharListSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralRegexHeredoc> getLiteralRegexHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralRegexHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralRegexLine> getLiteralRegexLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralRegexLine.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralSigilHeredoc> getLiteralSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralSigilLine> getLiteralSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralStringSigilHeredoc> getLiteralStringSigilHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralStringSigilHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralStringSigilLine> getLiteralStringSigilLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralStringSigilLine.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralWordsHeredoc> getLiteralWordsHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralWordsHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirLiteralWordsLine> getLiteralWordsLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirLiteralWordsLine.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedDotLeftOperation> getMatchedDotLeftOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedDotLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedDotRightOperation getMatchedDotRightOperation() {
    return findChildByClass(ElixirMatchedDotRightOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedHatLeftOperation getMatchedHatLeftOperation() {
    return findChildByClass(ElixirMatchedHatLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedHatRightOperation getMatchedHatRightOperation() {
    return findChildByClass(ElixirMatchedHatRightOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedMultiplicationLeftOperation getMatchedMultiplicationLeftOperation() {
    return findChildByClass(ElixirMatchedMultiplicationLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedMultiplicationRightOperation getMatchedMultiplicationRightOperation() {
    return findChildByClass(ElixirMatchedMultiplicationRightOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedNonNumericAtLeftOperation> getMatchedNonNumericAtLeftOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedNonNumericAtLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedNonNumericAtRightOperation getMatchedNonNumericAtRightOperation() {
    return findChildByClass(ElixirMatchedNonNumericAtRightOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedNonNumericCaptureLeftOperation> getMatchedNonNumericCaptureLeftOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedNonNumericCaptureLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedNonNumericCaptureRightOperation getMatchedNonNumericCaptureRightOperation() {
    return findChildByClass(ElixirMatchedNonNumericCaptureRightOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirMatchedNonNumericUnaryLeftOperation> getMatchedNonNumericUnaryLeftOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirMatchedNonNumericUnaryLeftOperation.class);
  }

  @Override
  @Nullable
  public ElixirMatchedNonNumericUnaryRightOperation getMatchedNonNumericUnaryRightOperation() {
    return findChildByClass(ElixirMatchedNonNumericUnaryRightOperation.class);
  }

  @Override
  @NotNull
  public List<ElixirNoParenthesesExpression> getNoParenthesesExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirNoParenthesesExpression.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesKeywords getNoParenthesesKeywords() {
    return findChildByClass(ElixirNoParenthesesKeywords.class);
  }

  @Override
  @Nullable
  public ElixirNoParenthesesNoArgumentsCall getNoParenthesesNoArgumentsCall() {
    return findChildByClass(ElixirNoParenthesesNoArgumentsCall.class);
  }

  @Override
  @NotNull
  public List<ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable> getNoParenthesesNoArgumentsUnqualifiedCallOrVariableList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirNoParenthesesNoArgumentsUnqualifiedCallOrVariable.class);
  }

  @Override
  @NotNull
  public List<ElixirNumber> getNumberList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirNumber.class);
  }

  @Override
  @Nullable
  public ElixirQualifiedAlias getQualifiedAlias() {
    return findChildByClass(ElixirQualifiedAlias.class);
  }

  @Override
  @NotNull
  public List<ElixirStringHeredoc> getStringHeredocList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirStringHeredoc.class);
  }

  @Override
  @NotNull
  public List<ElixirStringLine> getStringLineList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirStringLine.class);
  }

  @Override
  @NotNull
  public List<ElixirUnaryNumericOperation> getUnaryNumericOperationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ElixirUnaryNumericOperation.class);
  }

  @NotNull
  public OtpErlangObject[] quoteArguments() {
    return ElixirPsiImplUtil.quoteArguments(this);
  }

}
