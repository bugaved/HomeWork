package horse;

import horse.Num;
import static horse.Num.m;
import static horse.Num.i;
import static horse.Num.j;

public class HomeWork55 {

    public static void main(String[] args) {
        int ni = 0;
        int nj = 0;

        for (int x = 0; x < i * j; x++) {
            int k = 12;
            m[ni][nj] = 1;
            boolean turn = false;
            Num xp2p1 = new Num(ni + 2, nj + 1);
            Num xp2m1 = new Num(ni + 2, nj - 1);
            Num xm2p1 = new Num(ni - 2, nj + 1);
            Num xm2m1 = new Num(ni - 2, nj - 1);
            Num xp1p2 = new Num(ni + 1, nj + 2);
            Num xp1m2 = new Num(ni + 1, nj - 2);
            Num xm1p2 = new Num(ni - 1, nj + 2);
            Num xm1m2 = new Num(ni - 1, nj - 2);
            if ((ni + 2 >= 0) && (nj + 1 >= 0) && (ni + 2 < i) && (nj + 1 < j)) {
                if ((xp2p1.getNumOfHits() < k) && (m[ni + 2][nj + 1] == 0)) {
                    k = xp2p1.getNumOfHits();
                }
            }
            if ((ni + 2 >= 0) && (nj - 1 >= 0) && (ni + 2 < i) && (nj - 1 < j)) {
                if ((xp2m1.getNumOfHits() < k) && (m[ni + 2][nj - 1] == 0)) {
                    k = xp2m1.getNumOfHits();
                }
            }
            if ((ni - 1 >= 0) && (nj - 2 >= 0) && (ni - 1 < i) && (nj - 2 < j)) {
                if ((xm1m2.getNumOfHits() < k) && (m[ni - 1][nj - 2] == 0)) {
                    k = xm1m2.getNumOfHits();
                }
            }
            if ((ni - 2 >= 0) && (nj + 1 >= 0) && (ni - 2 < i) && (nj + 1 < j)) {
                if ((xm2p1.getNumOfHits() < k) && (m[ni - 2][nj + 1] == 0)) {
                    k = xm2p1.getNumOfHits();
                }
            }
            if ((ni - 2 >= 0) && (nj - 1 >= 0) && (ni - 2 < i) && (nj - 1 < j)) {
                if ((xm2m1.getNumOfHits() < k) && (m[ni - 2][nj - 1] == 0)) {
                    k = xm2m1.getNumOfHits();
                }
            }
            if ((ni + 1 >= 0) && (nj + 2 >= 0) && (ni + 1 < i) && (nj + 2 < j)) {
                if ((xp1p2.getNumOfHits() < k) && (m[ni + 1][nj + 2] == 0)) {
                    k = xp1p2.getNumOfHits();

                }
            }
            if ((ni + 1 >= 0) && (nj - 2 >= 0) && (ni + 1 < i) && (nj - 2 < j)) {
                if ((xp1m2.getNumOfHits() < k) && (m[ni + 1][nj - 2] == 0)) {
                    k = xp1m2.getNumOfHits();
                }
            }
            if ((ni - 1 >= 0) && (nj + 2 >= 0) && (ni - 1 < i) && (nj + 2 < j)) {
                if ((xm1p2.getNumOfHits() < k) && (m[ni - 1][nj + 2] == 0)) {
                    k = xm1p2.getNumOfHits();
                }
            }
            if ((ni + 2 >= 0) && (nj + 1 >= 0) && (ni + 2 < i) && (nj + 1 < j)) {
                if ((xp2p1.getNumOfHits() == k) && (turn == false) && (m[ni + 2][nj + 1] == 0)) {

                    ni = ni + 2;
                    nj = nj + 1;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni + 2 >= 0) && (nj - 1 >= 0) && (ni + 2 < i) && (nj - 1 < j)) {
                if ((xp2m1.getNumOfHits() == k) && (turn == false) && (m[ni + 2][nj - 1] == 0)) {

                    ni = ni + 2;
                    nj = nj - 1;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni - 2 >= 0) && (nj + 1 >= 0) && (ni - 2 < i) && (nj + 1 < j)) {
                if ((xm2p1.getNumOfHits() == k) && (turn == false) && (m[ni - 2][nj + 1] == 0)) {

                    ni = ni - 2;
                    nj = nj + 1;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni - 2 >= 0) && (nj - 1 >= 0) && (ni - 2 < i) && (nj - 1 < j)) {
                if ((xm2m1.getNumOfHits() == k) && (turn == false) && (m[ni - 2][nj - 1] == 0)) {

                    ni = ni - 2;
                    nj = nj - 1;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni + 1 >= 0) && (nj + 2 >= 0) && (ni + 1 < i) && (nj + 2 < j)) {
                if ((xp1p2.getNumOfHits() == k) && (turn == false) && (m[ni + 1][nj + 2] == 0)) {

                    ni = ni + 1;
                    nj = nj + 2;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni + 1 >= 0) && (nj - 2 >= 0) && (ni + 1 < i) && (nj - 2 < j)) {
                if ((xp1m2.getNumOfHits() == k) && (turn == false) && (m[ni + 1][nj - 2] == 0)) {

                    ni = ni + 1;
                    nj = nj - 2;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni - 1 >= 0) && (nj + 2 >= 0) && (ni - 1 < i) && (nj + 2 < j)) {
                if ((xm1p2.getNumOfHits() == k) && (turn == false) && (m[ni - 1][nj + 2] == 0)) {

                    ni = ni - 1;
                    nj = nj + 2;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }
            if ((ni - 1 >= 0) && (nj - 2 >= 0) && (ni - 1 < i) && (nj - 2 < j)) {
                if ((xm1m2.getNumOfHits() == k) && (turn == false) && (m[ni - 1][nj - 2] == 0)) {

                    ni = ni - 1;
                    nj = nj - 2;
                    System.out.println(ni + " " + nj);
                    turn = true;
                }
            }

        }
    }

}
