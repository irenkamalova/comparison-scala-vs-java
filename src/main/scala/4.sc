case class Person(name: String, age: Int)

def person(optName: Option[String],
           optAge: Option[Int]) =
  for {
    name <- optName
    age <- optAge
  } yield Person(name, age)

val optName: Option[String] = Some("Peter")
val optAge: Option[Int] = Some(18)
val optNone = None

person(optName, optAge)
person(optName, optNone)
person(optNone, optAge)