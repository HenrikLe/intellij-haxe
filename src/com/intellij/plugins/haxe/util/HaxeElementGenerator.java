package com.intellij.plugins.haxe.util;

import com.intellij.openapi.project.Project;
import com.intellij.plugins.haxe.HaxeFileType;
import com.intellij.plugins.haxe.HaxeLanguage;
import com.intellij.plugins.haxe.lang.psi.HaxeImportStatement;
import com.intellij.plugins.haxe.lang.psi.impl.HaxeExpressionCodeFragmentImpl;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.LightVirtualFile;
import org.jetbrains.annotations.Nullable;

/**
 * @author: Fedor.Korotkov
 */
public class HaxeElementGenerator {
  @Nullable
  public static HaxeImportStatement createImportStatementFromText(Project myProject, String text) {
    final PsiFile dummyFile = createDummyFile(myProject, text);
    return PsiTreeUtil.getChildOfType(dummyFile, HaxeImportStatement.class);
  }

  public static PsiFile createDummyFile(Project myProject, String text) {
    final PsiFileFactory factory = PsiFileFactory.getInstance(myProject);
    final String name = "dummy." + HaxeFileType.HAXE_FILE_TYPE.getDefaultExtension();
    final LightVirtualFile virtualFile = new LightVirtualFile(name, HaxeFileType.HAXE_FILE_TYPE, text);
    final PsiFile psiFile = ((PsiFileFactoryImpl)factory).trySetupPsiForFile(virtualFile, HaxeLanguage.INSTANCE, false, true);
    assert psiFile != null;
    return psiFile;
  }

  public static PsiFile createExpressionCodeFragment(Project myProject, String text, PsiElement context, boolean resolveScope) {
    final String name = "dummy." + HaxeFileType.HAXE_FILE_TYPE.getDefaultExtension();
    HaxeExpressionCodeFragmentImpl codeFragment = new HaxeExpressionCodeFragmentImpl(myProject, name, text, true);
    codeFragment.setContext(context);
    return codeFragment;
  }
}