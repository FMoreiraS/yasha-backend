package com.yasha.store.exceptions;

public class NotFoundResourceException extends RuntimeException{

    public NotFoundResourceException(String message) {
        super(message);
    }

}
