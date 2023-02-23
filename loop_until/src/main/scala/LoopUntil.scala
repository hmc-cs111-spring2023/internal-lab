@main
def main() =

  // Implementer code
  def loop_until(condition: => Boolean)(body: => Unit) =
    while (!condition) {
      body
    }

  // End-user code
  var i = 0

  loop_until(i > 9) {
    if ((i % 2) == 0)
      println(i)
    i += 1
  }

end main
