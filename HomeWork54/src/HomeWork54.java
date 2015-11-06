
public class HomeWork54 {

    public static void main(String[] args) {
        int i = 5;
        int k = 5;
        int x = 0;
        int ni = 0;
        int nk = 0;
        int g = 1;
        int m[][] = new int[i][k];
        int number = 0;
        while (x < (i * k) + 2) {
            number++;
            m[ni][nk] = number;

            if ((ni == (g - 1)) && (nk >= g)) {
                x++;
                nk--;
            }
            if (nk == (k - g) && (ni >= g)) {
                x++;
                ni--;
            }
            if ((ni == (i - g)) && (nk < (k - g))) {
                x++;
                nk++;
            }
            if ((ni <= (i - g)) && (nk == (g - 1))) {
                x++;
                ni++;
            }
            if ((ni == (g - 1)) && (nk == g)) {
                g++;
                x++;
            }

        }
        for (nk = 0; nk < k; nk++) {
            for (ni = 0; ni < i; ni++) {
                String f = String.format("%02d", m[ni][nk]);
                System.out.print(f + " ");
            }
            System.out.println("");
        }

    }
}
