package server

import net.lag.configgy.Configgy
import net.lag.logging.Logger
import se.scalablesolutions.akka.actor.Actor.actorOf
import se.scalablesolutions.akka.actor._

object server
{
  
  def main(args: Array[String]) =
  {
  	var port = 9999
	  if ( args.length >=1 )
		{
		  port = args(0).toInt
		}
		
		if ( args.length >= 2)
		{
		  var configFile = args(1)
		  Configgy.configure( configFile )
    
		}
  
    println( "port is " + port.toString() )

  }
}
