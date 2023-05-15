package utilities;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log {
Logger logger = LogManager.getLogger(Log.class);

public void info(String message) {
  logger.info(message);
 }
public void error(String message) {
logger.error(message);
}
 public void trace(String message) {
logger.trace(message);
 }
public void warn(String message) {
logger.warn(message);
}
}
