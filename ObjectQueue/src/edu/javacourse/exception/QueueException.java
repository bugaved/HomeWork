package edu.javacourse.exception;
public class QueueException extends Exception {

    private int errorCode;

    public QueueException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

   }
