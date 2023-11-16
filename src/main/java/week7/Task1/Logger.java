package week7.Task1;

public interface Logger {
    void logMessage(String message);
}

record RecordLogger(String loggerName) implements Logger{
    @Override
    public void logMessage(String message){
        System.out.println("[" + loggerName + "]" + message);
    }
}
