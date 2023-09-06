package org.example.bankaccount;

public class Logger {
//    private static java.util.logging.Logger LoggerUser;
//    private static final Class<Readable> LOGGER = Readable.class;
//
//    public static Class<Readable> getLOGGER() {
//        return LOGGER;
//    }
    private Logger userRegistry;

    {
       Logger john = new Logger();
        john.LOGGER("John");
    }

    {
        Logger julia = new Logger();
        julia.LOGGER("Julia");
    }

    private void LOGGER(String name) {
    }
}
