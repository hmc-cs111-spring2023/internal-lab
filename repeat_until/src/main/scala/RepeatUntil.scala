@main
def main() =
  class repeat(body: => Unit) {
    def until(condition: => Boolean) =
      while (!condition) {
        body
      }
  }

  var i = 0
  repeat {
    if ((i % 2) == 0)
      println(i)
    i += 1
  } until (i > 9)

end main
