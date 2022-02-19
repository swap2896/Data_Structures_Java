import java.util.Scanner;

public class Singlelinked {

    class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void push(int element)
    {
        Node newnode=new Node(element);
        if(head==null)
        {
            head=newnode;
            head.next=null;
        }
        else{
            newnode.next=head;
            head=newnode;
        }

    }
    public void delete()
    {
        Node del;
        if(head==null)
        {
            System.out.println("Stack is empty");

        }
        else{
            del=head;
            head=head.next;
            System.out.println("Deleted Element is "+del.data);
        }
    }
    public void top()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");

        }
        else{
            System.out.println("Top of stack is "+ head.data);
        }

    }
    public void display()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("Stack is empty");
        }
        else{
            while(current.next!=null)
            {
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.print(current.data);
        }
    }
}
