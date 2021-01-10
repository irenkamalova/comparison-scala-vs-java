
case class Person(name: String, age: Int)

val p = Person("Peter", 5)

p.name
p.age

val peter = Person("Peter", 5)
val dom = Person("Dominique", 3)

p == dom
p == peter

p.toString