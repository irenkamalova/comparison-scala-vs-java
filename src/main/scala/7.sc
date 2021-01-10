
def div(a: Int, b: Int): Int = {
  if (b == 0) throw new ArithmeticException("Division by Zero")
  a / b
}

val a = 1
val b = 0

def evaluate(a: Int, b: Int): Either[Exception, Int] = {
  try {
    Right(div(a, b))
  } catch {
    case e: ArithmeticException => Left(e)
    case _ => Left(new UnsupportedOperationException)
  }
}

val result = evaluate(a, b).getOrElse(0)