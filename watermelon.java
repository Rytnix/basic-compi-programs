import java.util.Scanner;
public class watermelon
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
         
        int n ;
        n=sc.nextInt();
        if(n%2==0 && n>3)
        System.out.println("YES");
        else 
        System.out.println("NO");
    }}
