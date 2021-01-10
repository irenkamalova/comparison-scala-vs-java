import com.sun.org.slf4j.internal.{Logger, LoggerFactory}

import scala.collection.mutable.ListBuffer

case class Person(name: String, age: Int)

trait PersonRepository {

  def logger: Logger

  def save(person: Person)

  def findAll: List[Person]

  def findByName(name: String): List[Person] = {
    findAll.filter(p => p.name == name)
  }
}

class InMemoryPersonRepository extends PersonRepository {
  val list = ListBuffer[Person]()

  override val logger = LoggerFactory.getLogger(classOf[InMemoryPersonRepository])

  override def save(person: Person): Unit = {
    list += person
    logger.debug(s"Saved person with name ${person.name} and age ${person.age}")
  }

  override def findAll: List[Person] = list.toList
}

