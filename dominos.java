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

