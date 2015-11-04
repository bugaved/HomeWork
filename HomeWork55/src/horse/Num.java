package horse;

public class Num {

    private int numOfHits = 0;
    private int ni;
    private int nk;
    private int mik;

    public int getNumOfHits() {
        return numOfHits;
    }
    public static int i = 5;
    public static int k = 5;

    public Num(int ni, int nk, int mik) {
        this.mik=mik;
        this.ni=ni;
        this.nk=nk;
        for (int x = 0; x < 8; x++) {
            if ((ni + 3 < i) && (nk + 1 < k) && (mik == 0)) {
                numOfHits++;
            }

            if ((ni - 3 < i) && (nk + 1 < k) && (mik == 0) && (ni - 3 > 0) && (nk + 1 > 0)) {
                numOfHits++;
            }
            if ((ni + 3 < i) && (nk - 1 < k) && (mik == 0) && (ni + 3 > 0) && (nk - 1 > 0)) {
                numOfHits++;
            }
            if ((ni - 3 < i) && (nk - 1 < k) && (mik == 0) && (ni - 3 > 0) && (nk - 1 > 0)) {
                numOfHits++;
            }
            if ((ni + 1 < i) && (nk + 3 < k) && (mik == 0) && (ni + 1 > 0) && (nk + 3 > 0)) {
                numOfHits++;
            }
            if ((ni + 1 < i) && (nk - 3 < k) && (mik == 0) && (ni + 1 > 0) && (nk - 3 > 0)) {
                numOfHits++;
            }
            if ((ni - 1 < i) && (nk - 3 < k) && (mik == 0) && (ni - 1 > 0) && (nk - 3 > 0)) {
                numOfHits++;
            }
            if ((ni - 1 < i) && (nk + 3 < k) && (mik == 0) && (ni - 1 > 0) && (nk + 3 > 0)) {
                numOfHits++;
            }

        }
    }
}
