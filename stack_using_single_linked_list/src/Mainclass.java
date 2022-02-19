import java.util.Scanner;

public class Mainclass {
    public static void main(String args[])
    {
        Singlelinked s=new Singlelinked();
        int x=0;
        while (x != 5) {
            System.out.println("\nPerform basic stack Operations." +
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
                    s.delete();
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
