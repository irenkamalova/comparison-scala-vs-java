import example.operation.Operation
import example.operation.Operation._

import scala.collection.mutable.ListBuffer;

class OperationRepository {
  val list = ListBuffer[Operation]()

  def save(operation: Operation): Unit = {
    operation match {
      case ADD || INSERT || UPDATE =>
        list += operation
      case DELETE =>
        list -= operation
    }
  }
}

