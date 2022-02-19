//Primitive operations on Stacks using arrays.
import java.util.Scanner;


public class mainclass {
    public static void main(String args[]) {
        stack s = new stack();
        int x = 0;
        while (x != 5) {
            System.out.println("Perform basic stack Operations." +
                    "\nPress 1 to push element" +
                    "\nPress 2 to pop element" +
                    "\nPress 3 for display" +
                    "\nPress 4 to get top"+
                    "\nPress 5 for exit\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\nEnter an element you want to insert");
                    int y = sc.nextInt();
                    s.push(y);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    s.top();
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

