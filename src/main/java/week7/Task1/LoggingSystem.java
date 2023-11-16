package week7.Task1;

import week7.Task1.ClassLogger;
import week7.Task1.Logger;
import week7.Task1.RecordLogger;

public class LoggingSystem {
    public static void main(String[] args){
        Logger recordLogger = new RecordLogger("RecordLogger");
        Logger classLogger = new ClassLogger("ClassLogger");

        Logger logFunction1 = (message) -> recordLogger.logMessage("Log 1: " + message);
        Logger logFunction2 = (message) -> classLogger.logMessage("Log 2: " + message);

        logFunction1.logMessage("Message logged using RecordLogger");
        logFunction2.logMessage("Message logged using ClassLogger");
    }
}
