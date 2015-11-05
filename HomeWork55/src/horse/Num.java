package horse;

public class Num {

    private int numOfHits = 0;
    private int ni;
    private int nj;

    public static final int i = 5;
    public static final int j = 5;

    public static int m[][] = new int[i][j];

    public int getNumOfHits() {
        return numOfHits;
    }

    public Num(int ni, int nk) {
        this.ni = ni;
        this.nj = nk;
        Method1();

    }

    public void Method1() {
        if ((ni < i) && (ni >= 0) && (nj < j) && (nj >= 0)) {
          
            if ((ni + 2 < i) && (nj + 1 < j) && (ni + 2 >= 0) && (nj + 1 >= 0)) {
                if ((m[ni + 2][nj + 1] == 0)) {
                    numOfHits++;
                }
            }

            if ((ni - 2 < i) && (nj + 1 < j) && (ni - 2 >= 0) && (nj + 1 >= 0)) {
                if (m[ni - 2][nj + 1] == 0) {
                    numOfHits++;
                }
            }
            if ((ni + 2 < i) && (nj - 1 < j) && (ni + 2 >= 0) && (nj - 1 >= 0)) {
                if ((m[ni + 2][nj - 1] == 0)) {
                    numOfHits++;
                }
            }
            if ((ni - 2 < i) && (nj - 1 < j) && (ni - 2 >= 0) && (nj - 1 >= 0)) {
                if ((m[ni - 2][nj - 1] == 0)) {
                    numOfHits++;
                }
            }
            if ((ni + 1 < i) && (nj + 2 < j) && (ni + 1 >= 0) && (nj + 2 >= 0)) {
                if ((m[ni + 1][nj + 2] == 0)) {
                    numOfHits++;
                }
            }
            if ((ni + 1 < i) && (nj - 2 < j) && (ni + 1 >= 0) && (nj - 2 >= 0)) {
                if ((m[ni + 1][nj - 2] == 0)) {
                    numOfHits++;
                }
            }
            if ((ni - 1 < i) && (nj - 2 < j) && (ni - 1 >= 0) && (nj - 2 >= 0)) {
                if ((m[ni - 1][nj - 2] == 0)) {
                    numOfHits++;
                }
            }
            if ((ni - 1 < i) && (nj + 2 < j) && (ni - 1 >= 0) && (nj + 2 >= 0)) {
                if ((m[ni - 1][nj + 2] == 0)) {
                    numOfHits++;
                }
                            
                

            }

        } else {
            numOfHits = 99;
        }
    }
}
