package week7.Task1;

import week7.Task1.Logger;

class ClassLogger implements Logger {
    private final String loggerName;

    public ClassLogger(String loggerName){
        this.loggerName = loggerName;
    }

    @Override
    public void logMessage(String message){
        System.out.println("[" + loggerName + "]" + message);
    }
}


