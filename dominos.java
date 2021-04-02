/* You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:

1. Each domino completely covers two squares.

2. No two dominoes overlap.

3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.

Find the maximum number of dominoes, which can be placed under these restrictions.

Input
In a single line you are given two integers M and N — board sizes in squares (1 ≤ M ≤ N ≤ 16).

Output
Output one number — the maximal number of dominoes, which can be placed. */
import java.util.Scanner;

public class dominos
        {
            int m,n,sum=0;

            dominos(int m,int n)
            {
                this.m=m;
                this.n=n;

            }
            void reverse()
            {
                m ^=n;
                n ^=m;
                m ^=n;
            }
            void dominosmax()
            {
                if(m<2)
                    reverse();

                int i=m;

                if(m>2) {
                    while (i >= 1) {

                        if (m > 2) {
                            i = m - 2;
                            if(i==0){
                                break;
                            }
                            sum += n;

                            m = i;
                        } else if (m == 1 || m==2) {
                            if (n == 1) {
                                break;
                            }
                            else if(m==2 )
                                break;
                          else {
                                i ^= n;
                                n ^= i;
                                i ^= n;
                                m = i;
                            }

                        }

                    }
                }
                 if (m==2)
                    sum +=n;
                System.out.println(sum);
            }

            public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);

                dominos ob= new dominos(sc.nextInt(),sc.nextInt());
                ob.dominosmax();
            }
}

