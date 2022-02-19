//Evaluation of a valid Postfix expression using stacks.
import java.util.Scanner;

public class Mainclass {
    public static void main(String args[])
    {
        linearqueue lq=new linearqueue();
        int x = 0;
        while (x != 5) {
            System.out.println("Perform basic Linear Queue Operations." +
                    "\nPress 1 to insert element" +
                    "\nPress 2 to remove element" +
                    "\nPress 3 for display" +
                    "\nPress 4 to get front"+
                    "\nPress 5 for exit\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\nEnter an element you want to insert");
                    int y = sc.nextInt();
                    lq.insert(y);
                    break;
                case 2:
                    lq.remove();
                    break;
                case 3:
                    lq.display();
                    break;
                case 4:
                    lq.front();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("\nIncorrect Choice");
                    break;
            }
        }
    }
}

