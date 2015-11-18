package com.sportshop.exception;

public class SportShopException extends Exception {

    public SportShopException() {
    }

    public SportShopException(String message) {
        super(message);
    }

    public SportShopException(String message, Throwable cause) {
        super(message, cause);
    }

    public SportShopException(Throwable cause) {
        super(cause);
    }

    public SportShopException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
