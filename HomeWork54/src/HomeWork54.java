
public class HomeWork54 {

    public static void main(String[] args) {
        int i = 5;
        int k = 5;
        int x = 0;
        int ni = 0;
        int nk = 0;
        int g = 1;
        int m[][] = new int[i][k];
        while (x < (i * k)+1) {

            if ((ni < (i - g)) && (nk == (g - 1))) {
                System.out.println(ni + " " + nk);
                x++;
                ni++;
            }
            if ((ni == (i - g)) && (nk < (k - g))) {
                System.out.println(ni + " " + nk);
                x++;
                nk++;
            }
            if (nk == (k - g) && (ni >= g)) {
                System.out.println(ni + " " + nk);
                x++;
                ni--;
            }
            if ((ni == (g - 1)) && (nk >= g)) {
                System.out.println(ni + " " + nk);
                x++;
                nk--;
            }
            if ((ni == (g - 1)) && (nk == g)) {
                g++;
                  x++;
               

            }

        }
          System.out.println(ni + " " + nk);
        
    }
}
