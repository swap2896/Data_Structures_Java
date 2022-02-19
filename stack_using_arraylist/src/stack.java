//Primitive operations on Stacks using arrays.
import java.util.ArrayList;

public class stack {
    ArrayList<Integer> arr=new ArrayList<>();
    void push(int y) {
        if(arr.size()==0)
        {
            arr.add(y);
            System.out.println("Element pushed in stack");
        }
        else if(arr.size()==10)
        {
            System.out.println("Stack Overflow");
        }
        else{
            arr.add(arr.size(),y);
            System.out.println("Element pushed in stack");
        }
    }
    void top()
    {
        if(arr.size()==0)
        {
            System.out.println("stack is empty");
        }
        else {
            System.out.println("Top element of stack is " + arr.get(arr.size() - 1));
        }
    }

    void pop() {
        if(arr.size()==0)
        {
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("Element Poped: "+ arr.get(arr.size() - 1));
            System.out.println(arr.remove(arr.size()-1));
        }

    }

    void display() {
        if(arr.size()==0)
        {
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("Stack Elements are:");
            for(int i=arr.size()-1;i>=0;i--)
            {
                System.out.print("\t"+arr.get(i));
            }
            System.out.println();
        }

    }
}
