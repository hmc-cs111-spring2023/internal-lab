@main
def main() =
  // define the new control-flow structure here

  def loop_until(condition: => Boolean)(body: => Unit) =
    while (!condition) {
      body
    }

  var i = 0

  loop_until(i > 9) {
    if ((i % 2) == 0)
      println(i)
    i += 1
  }

end main
