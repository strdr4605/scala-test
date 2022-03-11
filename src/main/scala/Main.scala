// @main def hello: Unit = 
//   println("Hello world!")
//   println(msg)
//
// def msg = "I was compiled by Scala 3. :)"
import scala.io.StdIn.readLine
import akka.actor.{ActorRef, ActorSystem, Props}

object MainApp {

  def main(args : Array[ String ]) : Unit = {
    val actorSystem:ActorSystem=ActorSystem("ActorSystem")
    val actor = actorSystem.actorOf(Props[My_Actor](), "Actor")

    while(true){
      val message = readLine()
      actor ! message
    }
  }
}

