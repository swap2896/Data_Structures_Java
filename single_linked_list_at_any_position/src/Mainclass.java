import java.util.Scanner;

public class Mainclass {
    public static void main(String args[])
    {
        singlelinked s=new singlelinked();
        int x=0;
        while (x != 4) {
            System.out.println("\nPerform basic Queue Operations." +
                    "\nPress 1 to push element" +
                    "\nPress 2 to pop element" +
                    "\nPress 3 for display" +
                    "\nPress 4 for exit\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\nEnter an element you want to insert");
                    int y = sc.nextInt();
                    System.out.println("\nEnter the position");
                    int pos=sc.nextInt();
                    s.insert(pos,y);
                    break;
                case 2:
                    System.out.println("\nEnter the position");
                    int posd=sc.nextInt();
                    s.delete(posd);
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("\nIncorrect Choice");
                    break;
            }
        }
    }
}
