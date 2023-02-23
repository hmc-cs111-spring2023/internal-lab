@main
def main() =

  // Implementer code

  // ... implement continue as an exception
  object ContinueException extends Exception
  def continue = throw ContinueException

  // ... the loop body executes in a try block that catches the continue exception
  def while_c(condition: => Boolean)(body: => Unit): Unit = {
    while (condition) {
      try {
        body
      } catch {
        case ContinueException => while_c(condition)(body)
      }
    }
  }

  // End-user code
  var i = -1

  while_c(i < 9) {
    i += 1
    if ((i % 2) != 0)
      continue
    println(i)
  }

end main
