
public class HomeWork53 {

    public static void main(String[] args) {
        int m[] = new int[10];
        int x = 19;
        boolean f = false;
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100);
            System.out.print(m[i] + " ");
        }
        System.out.println("");
        for (int i = m.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (m[j] > m[j + 1]) {
                    int k = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = k;
                }
            }
          
        }
         for (int i = 0; i < m.length; i++) {
             System.out.print(m[i] + " ");
         }
        System.out.println("");
        for (int i = 0; i < m.length; i++) {
            if (m[i] > x) {
                break;
            } else {
                if (m[i] == x) {
                    System.out.println("найдено в ячейке номер " + (i + 1));
                    f = true;
                }
            }

        }
        if (f == false) {
            System.out.println("x не найден");
        }
    }
}
