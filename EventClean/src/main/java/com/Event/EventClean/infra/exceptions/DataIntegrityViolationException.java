package com.Event.EventClean.infra.exceptions;

public class DataIntegrityViolationException extends RuntimeException{

    public DataIntegrityViolationException(){super("Double key exception");}

    public DataIntegrityViolationException(String message){super(message);}
}
