# Changelog

## v0.1.4

* Enhancements
 * [#17](https://github.com/KronicDeth/intellij-elixir/pull/17): All valid escape sequences (`\<character>`, `\x<hexadecimal>`, `\x{<hexadecimal>}` are recognized. - [@KronicDeth](https://github.com/KronicDeth)
 * [#18](https://github.com/KronicDeth/intellij-elixir/pull/18): Support for creation of Elixir modules - [@abaire](https://github.com/abaire) ![New Elixir File](/screenshots/New%20Elixir%20File.png?raw=true "New Elixir File")
 * [#21](https://github.com/KronicDeth/intellij-elixir/pull/21): Use [pygments' elixir_example.ex](https://bitbucket.org/birkenfeld/pygments-main/src/102ed2526c384403fd0e0129b3e31832a6583ea1/tests/examplefiles/example_elixir.ex?at=default) supplied by [@alco](https://github.com/alco) for Color Settings Page - [@KronicDeth](https://github.com/KronicDeth)
* Bug Fixes
 * [#17](https://github.com/KronicDeth/intellij-elixir/pull/17): Sigil terminator escapes are recognized, so that sigils are no longer prematurely terminated. - [@KronicDeth](https://github.com/KronicDeth)
 * [#24](https://github.com/KronicDeth/intellij-elixir/pull/24): Comments do not consume EOL, so trailing comments don't cause error parsing expression on following line. - [@KronicDeth](https://github.com/KronicDeth)

## v0.1.3

* Bug Fixes
 * [#10](https://github.com/KronicDeth/intellij-elixir/pull/10): Blank lines are properly parsed as whitespace instead of bad characters. - [@KronicDeth](https://github.com/KronicDeth)
 * [#13](https://github.com/KronicDeth/intellij-elixir/pull/13): EOL is parsed as bad character in sigil name (after `~`) instead of causing the lexer to fail to match, which raised exceptions in Event Log. - [@KronicDeth](https://github.com/KronicDeth)

## v0.1.2

* Enhancements
 * Atoms with highlighting
    * Atom with double or single quotes to allow interpolation.  Double quotes are highlighted as 'String' while single
      quotes are highlighted as 'Char List'.  This may be changed in the future.
    * Literal atoms highlighted as 'Atom'.
    * Operator atoms highlighted as 'Atom'.

## v0.1.1

* Bug Fixes
  * Build using JDK 6 instead of 7 so that plugin will work by default on OSX Mavericks.

## v0.1.0

* Enhancements
  * [#3](https://github.com/KronicDeth/intellij-elixir/pull/3): Literal and interpolated sigils with highlighting - [@KronicDeth](https://github.com/KronicDeth)
    * CharList Sigils (`~c` and `~C`) highlighted as 'Char List' in Settings.
    * Regex Sigils (`~r` and `~R`) highlighted as 'Sigil' in Settings. **NOTE: Regex syntax is not internally highlighted yet**
    * String Sigils (`~s` and `~S`) highlighted as 'String' in Settings.
    * Word Sigils (`~w` and `~W`) highlighted as 'Sigil' in Settings.
    * Custom Sigils highlighted as 'Sigil' in Settings.
    * Modifiers are highlighted on Regex, Word, and Custom while modifiers aren't allowed on CharList and String Sigils.
* Bug Fixes
  * Single-quoted strings are correctly referred to as 'Character List' now instead of 'String' in Settings.
  * Double-quoted strings are correctly referred to as 'String' now instead of 'Interpolated String' in Settings.
  * Non-Heredoc CharLists and Strings can be multiline.
  * CharLists and Strings support interpolation and escape sequences.

## v0.0.3

* Enhancements
  * Single quoted strings with highlighting. ('String' in Color Settings.)
  * Double quoted strings with highlighting. ('Interpolated String' in Color Settings.)
     * Interpolation (`#{` and `}`) with highlighting. ('Expression Substitution Mark' in Color Settings.)
     * Escape sequences for `"` and `#` with highlighting. ('Escape Sequence' in Color Settings.)   

## v0.0.2

* Enhancements
  * Binary, Hexadecimal, and Octal numbers (including deprecated syntax) are recognized as numbers.
  * Syntax Highlighting for numbers.
  * Color Settings page for changing the color of comments and numbers for Elixir (Preferences > Editor > Colors & Fonts > Elixir).
* Bug Fixes
  * Parser no longer freezes IDE on tokens it doesn't understand.
  * White space at beginning of lines no longer leads to annotation errors.
  * White space and EOLs at beginning of file no longer lead to annotation errors.