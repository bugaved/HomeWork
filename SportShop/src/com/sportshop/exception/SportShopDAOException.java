package com.sportshop.exception;

public class SportShopDAOException extends SportShopException
{

    public SportShopDAOException() {
    }

    public SportShopDAOException(String message) {
        super(message);
    }

    public SportShopDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public SportShopDAOException(Throwable cause) {
        super(cause);
    }

    public SportShopDAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
