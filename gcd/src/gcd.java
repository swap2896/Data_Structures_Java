import java.util.Scanner;

public class gcd {
    public static void greatcommon(int a,int b)
    {
        int i=1,gcd=1;
        while(a>=i && b>=i)
        {
            if((a%i==0) && (b%i==0))
            {
                gcd=i;
            }
            i++;
        }
        System.out.println("GCD is "+gcd);

    }
    public static void main(String args[])
    {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter the second number");
        int y=sc.nextInt();
        greatcommon(x,y);

    }
}
