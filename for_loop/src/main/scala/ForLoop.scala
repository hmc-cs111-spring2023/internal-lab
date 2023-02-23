@main
def main =

  // Implementer code
  def for_loop(
      initializer: => Unit
  )(condition: => Boolean)(increment: => Unit)(body: => Unit) = {
    initializer
    while (condition) {
      body
      increment
    }
  }

  // End-user code
  var i = 0;

  for_loop((i = 0))(i < 10)(i += 2) {
    println(i);
  }

end main
