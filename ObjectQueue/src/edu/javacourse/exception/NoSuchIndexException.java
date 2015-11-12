package edu.javacourse.exception;

public class NoSuchIndexException extends QueueException {

    public NoSuchIndexException() {
        super(111, "Некорректный индекс элемента");
    }
}
