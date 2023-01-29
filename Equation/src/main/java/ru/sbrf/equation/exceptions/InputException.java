package ru.sbrf.equation.exceptions;

import java.io.IOException;
import java.util.logging.Logger;

public class InputException extends IOException {

    private static Logger log = Logger.getLogger(InputException.class.getName());

    public InputException (String msg) {
        log.info("Wrong input data");
    }

}
