# Groovy `eachWithIndex` `return` Behavior

This example demonstrates a common pitfall in Groovy when using the `return` statement within an `eachWithIndex` closure.  The `return` statement only exits the closure, not the surrounding method.  This can lead to unexpected code execution if not handled correctly.

The `bug.groovy` file contains code demonstrating this behavior. The `bugSolution.groovy` shows how to solve it using `break` to exit the loop or by restructuring the logic.

## Solution

Use the `break` statement inside the closure to break out of the loop entirely.  Alternatively, you could rewrite the logic to avoid relying on `return` in this manner.
