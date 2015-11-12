
package edu.javacourse.exception;

public class EmptyQueueException extends QueueException {
        public EmptyQueueException() {
        super(222, "Пустая очередь");
    }
}
