package org.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

    @Value("${root.level}")
    private String rootLevel;

    @Value("${parent.level}")
    private String parentLevel;

    @PostConstruct
    public void init(){
        Level levelRoot = Level.parse(rootLevel);
        Level levelParent = Level.parse(parentLevel);

        Logger applicationLogger = Logger.getLogger(AnnotationConfigApplicationContext.class.getName());

        Logger parentLogger = applicationLogger.getParent();
        parentLogger.setLevel(levelRoot);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(levelParent);
        consoleHandler.setFormatter(new SimpleFormatter());

        parentLogger.addHandler(consoleHandler);
    }
}
