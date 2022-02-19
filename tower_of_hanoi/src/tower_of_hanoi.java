import java.util.Scanner;

public class tower_of_hanoi {

   public static void towers(int disks,char from,char to,char temp)
   {
       if(disks==1)
       {
           System.out.println("Move disks "+disks+" from "+from+" to "+to);
       }
       else{
           towers(disks-1,from,temp,to);
           System.out.println("Move disks from "+from+" to "+to);
           towers(disks-1,temp,to,from);
       }
   }
    public static void main(String args[])
    {
        System.out.println("Enter the number of disks");
        Scanner sc=new Scanner(System.in);
        int disks=sc.nextInt();
        System.out.println("The number of Moves involved in Tower of Hanoi are: ");
        towers(disks,'A','C','B');

    }

}
