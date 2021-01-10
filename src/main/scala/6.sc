
trait Service {
  def add(a: Int, b: Int): Int
}

class SimpleService(name: String) extends Service {
  def add(a: Int, b: Int): Int = {
    a + b
  }
}

trait StdoutLogger {
  def log(msg: String) = println(msg)
}

trait LoggedService extends SimpleService with StdoutLogger {
  override def add(a: Int, b: Int): Int = {
    val result = super.add(a, b)
    log(s"Result of computation is $result")
    result
  }
}

object Example {
  def main(args: Array[String]): Unit = {
    val service = new SimpleService("service") with LoggedService
    service.add(1, 2)
  }
}