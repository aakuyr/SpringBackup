package demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    private String rootLoggerLevel;
    private String printedLoggerLevel;

    public void setRootLoggerLevel(String rootLoggerLevel){
        this.rootLoggerLevel = rootLoggerLevel;
    }

    public void setPrintedLoggerLevel(String printedLoggerLevel){
        this.printedLoggerLevel = printedLoggerLevel;
    }

    public void initLogger(){

        Level rootLevel = Level.parse(rootLoggerLevel);
        Level printedLevel = Level.parse(printedLoggerLevel);

        Logger applicationContextLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        Logger parentLogger = applicationContextLogger.getParent();
        parentLogger.setLevel(rootLevel);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(printedLevel);
        consoleHandler.setFormatter(new SimpleFormatter());

        parentLogger.addHandler(consoleHandler);
    }
}
