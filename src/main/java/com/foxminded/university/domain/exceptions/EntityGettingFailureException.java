package com.foxminded.university.domain.exceptions;

@SuppressWarnings("serial")
public class EntityGettingFailureException extends RuntimeException {
    
    public EntityGettingFailureException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public EntityGettingFailureException(String message) {
        super(message);
    }
    
    public EntityGettingFailureException() {
        super();
    }

}
