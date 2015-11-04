package horse;

public class Num {

    private int numOfHits = 0;
    private int ni;
    private int nk;
    private int mik;

    public static final int i = 5;
    public static final int k = 5;

    int m[][] = new int[i][k];

    public int getNumOfHits() {
        return numOfHits;
    }

    public Num(int ni, int nk) {
        this.ni = ni;
        this.nk = nk;
        Method1();

    }

    public void Method1() {
        if ((ni + 3 < i) && (nk + 1 < k) && (m[ni + 3][nk + 1] == 0)) {
            numOfHits++;
        }

        if ((ni - 3 < i) && (nk + 1 < k) && (ni - 3 > 0) && (nk + 1 > 0)) {
            if (m[ni - 3][nk + 1] == 0) {
                numOfHits++;
            }
        }
        if ((ni + 3 < i) && (nk - 1 < k) && (ni + 3 > 0) && (nk - 1 > 0)) {
            if ((m[ni + 3][nk - 1] == 0)) {
                numOfHits++;
            }
        }
        if ((ni - 3 < i) && (nk - 1 < k) && (ni - 3 > 0) && (nk - 1 > 0)) {
            if ((m[ni - 3][nk - 1] == 0)) {
                numOfHits++;
            }
        }
        if ((ni + 1 < i) && (nk + 3 < k) && (ni + 1 > 0) && (nk + 3 > 0)) {
            if ((m[ni + 1][nk + 3] == 0)) {
                numOfHits++;
            }
        }
        if ((ni + 1 < i) && (nk - 3 < k) && (ni + 1 > 0) && (nk - 3 > 0)) {
            if ((m[ni + 1][nk - 3] == 0)) {
                numOfHits++;
            }
        }
        if ((ni - 1 < i) && (nk - 3 < k) && (ni - 1 > 0) && (nk - 3 > 0)) {
            if ((m[ni - 1][nk - 3] == 0)) {
                numOfHits++;
            }
        }
        if ((ni - 1 < i) && (nk + 3 < k) && (ni - 1 > 0) && (nk + 3 > 0)) {
            if ((m[ni - 1][nk + 3] == 0)) {
                numOfHits++;
            }
        }
    }
}
