package de.halirutan.markdownextender;

import com.intellij.codeInsight.completion.CompletionParameters;
import com.intellij.codeInsight.lookup.LookupElement;
import com.intellij.lang.Language;
import com.intellij.lang.java.JavaLanguage;
import org.intellij.plugins.markdown.injection.CodeFenceLanguageProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

/**
 * @author patrick (20.02.19).
 */
public class MyLanguageFenceProvider implements CodeFenceLanguageProvider {
  @Nullable
  @Override
  public Language getLanguageByInfoString(@NotNull String s) {
    if ("mylang".equals(s)) {
      return JavaLanguage.INSTANCE;
    }
    return null;
  }

  @NotNull
  @Override
  public List<LookupElement> getCompletionVariantsForInfoString(@NotNull CompletionParameters completionParameters) {
    return Collections.emptyList();
  }
}
