import com.typesafe.scalalogging.Logger
import com.typesafe.scalalogging.slf4j.StrictLogging

object BugDemo extends App with StrictLogging {

  def logTest(logger: Logger) { logger.info("Second message") }

  logger.info("First message")
  logTest(logger)
}
