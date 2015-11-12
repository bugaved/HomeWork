package edu.javacourse.queue;

import edu.javacourse.exception.EmptyQueueException;
import edu.javacourse.exception.NoSuchIndexException;

public class QueueTest {

    public static void main(String[] arg) throws EmptyQueueException, NoSuchIndexException {
        ObjectQueue queue = new ObjectQueue();

        for (int i = 0; i < 10; i++) {
            // В данном случае мы складываем в очередь строки
            queue.push("Строка:" + i);
        }

        for (int i = -1; i < queue.size(); i++) {
            try {
            String s = (String) queue.get(i);
            System.out.println(s);
            }
            catch (EmptyQueueException ex) {
              System.out.println(ex.getMessage() + ", code=" + ex.getErrorCode());
            }
            catch (NoSuchIndexException ex) {
              System.out.println(ex.getMessage() + ", code=" + ex.getErrorCode());
            }
        }
        System.out.println("===============");
        while (queue.size() > 0) {

            // Мы делаем жесткое приведение типа, т.к. знаем, что там лежат строки
            String s = (String) queue.pull();
            System.out.println(s);
            System.out.println("Размер очереди:" + queue.size());

        }
    }
}
