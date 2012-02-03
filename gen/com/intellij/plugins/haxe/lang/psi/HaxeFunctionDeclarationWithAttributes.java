// This is a generated file. Not intended for manual editing.
package com.intellij.plugins.haxe.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface HaxeFunctionDeclarationWithAttributes extends HaxePsiCompositeElement {

  @Nullable
  public HaxeDeclarationAttributeList getDeclarationAttributeList();

  @Nullable
  public HaxeParameterList getParameterList();

  @Nullable
  public HaxeReturnStatementWithoutSemicolon getReturnStatementWithoutSemicolon();

  @Nullable
  public HaxeStatement getStatement();

  @Nullable
  public HaxeTypeParam getTypeParam();

  @Nullable
  public HaxeTypeTag getTypeTag();

}