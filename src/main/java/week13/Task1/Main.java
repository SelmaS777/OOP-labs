package week13.Task1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application strated");
        logger.logInfo("This is an informational message");
        logger.logWarning("Warning: Something might go wrong");
        logger.logError("Error: Critical failure occurred");
        logger.log("Application closing");

        Logger sameLogger = Logger.getInstance();
        System.out.println("Is the logger instance the same? " + (logger == sameLogger));
    }
}
