//Evaluation of a valid Postfix expression using stacks.
import java.util.ArrayList;

public class linearqueue {
    ArrayList<Integer> arr=new ArrayList<>();
    void insert(int x)
    {
        if(arr.size()==10)
        {
            System.out.println("Queue Overflow");
        }
        else
        {
            arr.add(x);
        }

    }
    void display()
    {
        if(arr.size()==0)
        {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Queue element are:");
            for (int i = 0; i < arr.size(); i++) {
                System.out.print("\t"+arr.get(i));
            }
            System.out.println("\n");
        }
    }
    void remove()
    {
        if(arr.size()==0)
        {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Element to be removed: "+arr.get(0));
            arr.remove(0);
        }

    }
    void front()
    {
        if(arr.size()==0)
        {
            System.out.println("Queue is empty");
        }
        else {
            System.out.println("Element at the top: "+arr.get(0));

        }
    }

}
