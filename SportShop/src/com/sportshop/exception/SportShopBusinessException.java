
package com.sportshop.exception;

public class SportShopBusinessException extends SportShopException {

    public SportShopBusinessException() {
    }

    public SportShopBusinessException(String message) {
        super(message);
    }

    public SportShopBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public SportShopBusinessException(Throwable cause) {
        super(cause);
    }

    public SportShopBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
