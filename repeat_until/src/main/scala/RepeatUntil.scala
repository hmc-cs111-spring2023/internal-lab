@main
def main() =

  // Implementer code
  class repeat(body: => Unit) {
    def until(condition: => Boolean) =
      body // the body always executes at least once
      while (!condition) {
        body
      }
  }

  // End-user code
  var i = 0
  repeat {
    if ((i % 2) == 0)
      println(i)
    i += 1
  } until (i > 9)

end main
