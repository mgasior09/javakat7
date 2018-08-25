package com.klb.exceptions;


public class IncorrectArgumenException extends Throwable {

    public IncorrectArgumenException() {
        super("invalid value");
    }

    public IncorrectArgumenException(String message) {
        super(message);
    }
}
