# Test-plugin for IntelliJ IDEA

It should use the Markdown plugin as dependency and add custom identifier for fenced code blocks to select the
programming language.

Usage:

1. `git clone https://github.com/halirutan/markdownextender.git`
2. `cd markdownextender`
3. `gradle runIde` (needs probably Gradle 5.1)
4. Install JB Markdown Plugin
5. It should map "mylang" to Java:

```
  @Nullable
  @Override
  public Language getLanguageByInfoString(@NotNull String s) {
    if ("mylang".equals(s)) {
      return JavaLanguage.INSTANCE;
    }
    return null;
  }
```

But it doesn't...