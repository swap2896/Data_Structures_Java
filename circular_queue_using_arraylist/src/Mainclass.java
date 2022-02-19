import java.util.Scanner;

public class Mainclass {
    public static void main(String args[]) {
        int x = 0;
        cicularqueue cql=new cicularqueue();
        while (x != 4) {
            System.out.println("\nPerform basic Circular queue Operations." +
                    "\nPress 1 to insert element" +
                    "\nPress 2 to delete element" +
                    "\nPress 3 for display" +
                    "\nPress 4 for exit\n");
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("\nEnter an element you want to insert");
                    int y = sc.nextInt();
                    cql.insert(y);
                    break;
                case 2:
                    cql.delete();
                    break;
                case 3:
                    cql.display();
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
