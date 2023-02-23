# Notes on the solution

This file contains some notes about the solution to the various control-flow puzzles.

## `loop_until`

[Solution code](loop_until/src/main/scala/LoopUntil.scala)

Key insights:

- We define a function `loop_until` with two parameter lists. The first list corresponds
  to the condition; the second list to the body.
- The condition and the body should be by-name parameters.
- The type of the body should be `=>Unit` (because `Unit` is the type of expression that
  is evaluated only for its side-effects).

## `for_loop`

[Solution code](for_loop/src/main/scala/ForLoop.scala)

Key insight:

- We essentially use the same techniques as the `loop_until`, but this time we define four
  parameter lists.

Commentary:

- It's a little unsatisfying that the end-user has to surround the initializer with an
  extra set of parentheses. In previous versions of scala, that wasn't necessary. I
  haven't found a way around it in Scala 3. If you find a way to avoid them, let everyone
  know!

## `while_c`

[Solution code](while_c/src/main/scala/WhileContinue.scala)

Key insights:

- Exceptions are the key to this puzzle!
- `continue` can be a function that raises an exception.
- The implementation of `while_c` catches the exception and restarts the loop. In this
  way, control flow transfers from the `continue` to the top of the loop.

## `repeat_until`

[Solution code](repeat_until/src/main/scala/RepeatUntil.scala)

Key insights:

- The code can be rewritten as `repeat(...).until(...)`.
- This suggests that `repeat` can be a class that defines an `until` method. The body of
  the loop is the argument to the class's constructor. The condition is an argument to the
  `until` method.
