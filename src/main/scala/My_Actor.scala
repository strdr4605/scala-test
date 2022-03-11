import akka.actor.{Actor, OneForOneStrategy}
import akka.actor.SupervisorStrategy.Restart

import scala.concurrent.duration.DurationInt

class My_Actor extends Actor{

  def receive = {
    case my_str      => println(my_str)
  }
}

