package behavioral.chainofresponsibility;

import org.junit.Before;
import org.junit.Test;

public class TestChainOfResponsibility
{
    private AbstractLogger loggerChain;

    @Before
    public void setUp()
    {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        loggerChain = errorLogger;
    }

    @Test
    public void testLoggerChain()
    {
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

}
