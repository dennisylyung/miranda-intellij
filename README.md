# Miranda SDK for Intellij

Miranda SDK plugin for Intellij IDEs. Work in progress.

## Features

### Syntax highlighting

* Lexical highlighting
* Grammar based highlighting
  * Function declarations
  * Function type specifications
  * Type definitions
  * Type parameters
* Matching braces highlighting
* Referencing
  * Variable declarations
  * Function arguments
  * Type definitions

## Installation

* Clone the repository
* Invoke the Gradle task `buildPlugin` under `intellij`
* Install the plugin in the Intellij IDE (see [here](jetbrains.com/help/idea/managing-plugins.html))
  * Open the `Plugins` menu in `Preferences`
  * Click the gear button and choose `Install plugin from disk`
  * Pick the `.zip` file under `build/distributions`

## References

- [Jetbrains step-by-step tutorial](https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html)
  - [Example Code](https://github.com/JetBrains/intellij-sdk-code-samples/tree/main/simple_language_plugin)
- [Miranda Manual](https://www.cs.kent.ac.uk/people/staff/dat/miranda/manual/)
  - [Grammar](https://www.cs.kent.ac.uk/people/staff/dat/miranda/manual/24.html)
  - [Syntax](https://www.cs.kent.ac.uk/people/staff/dat/miranda/manual/26.html)
- [Grammar-Kit](https://github.com/JetBrains/Grammar-Kit)
