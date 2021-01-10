
case class Person(name: String, age: Int)

object Person {
  private val AGE_LOW_BOUNDER = 0
  private val AGE_HIGH_BOUNDER = 200

  def apply(name: String, age: Int): Person = {
    if (age < AGE_LOW_BOUNDER || age > AGE_HIGH_BOUNDER)
      throw new IllegalArgumentException("Age is incorrect")
    new Person (name, age)
  }
}

Person("Peter", 18)
Person("Peter", -1)
Person("Peter", 201)