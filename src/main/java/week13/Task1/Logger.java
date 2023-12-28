package week13.Task1;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    private Logger() {
    }

    static Logger getInstance(){
        if (instance == null){
            instance = new Logger();
        }
        return instance;
    }

    private void logMessage(String severity, String message){
        LocalDateTime timestamp = LocalDateTime.now();
        System.out.println("[" + timestamp + "] [" + severity + "] " + message);
    }

    public void log(String message){
        logMessage("GENERAL", message);
    }

    public void logInfo(String message){
        logMessage("INFO", message);
    }

    public void logWarning(String message){
        logMessage("WARNING", message);
    }

    public void logError(String message){
        logMessage("ERROR", message);
    }
}


