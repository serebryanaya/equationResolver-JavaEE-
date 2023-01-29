package ru.sbrf.equation.exceptions;

import java.util.logging.Logger;

public class DivisorException extends RuntimeException {

    private static Logger log = Logger.getLogger(DivisorException.class.getName());

    public DivisorException (String msg) {
        log.info("Invalid action: divide to 0");
    }
}
