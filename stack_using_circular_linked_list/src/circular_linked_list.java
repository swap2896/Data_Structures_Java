public class circular_linked_list {
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    Node tail=null;

    public void push(int x)
    {
        Node newnode=new Node(x);
        if(head==null && tail==null)
        {
            head=newnode;
            tail=newnode;
            tail.next=newnode;
        }
        else{
            newnode.next=head;
            tail.next=newnode;
            head=newnode;
        }
    }

    public void display()
    {
        if(head==null && tail==null)
        {
            System.out.print("Stack is empty");
        }
        else{
            Node current=head;
            while(current.next!=head)
            {
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.print(current.data);
        }
    }
    public void top()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Top is "+head.data);
        }
    }
    public void pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty");
        }
        else if(head==tail)
        {
            int y=head.data;
            head=null;
            tail=null;
            System.out.println("Deleted element is "+y);
        }
        else{
            int y=head.data;
            Node temp=head.next;
            tail.next=temp;
            head=temp;
            System.out.println("Deleted element is "+y);
        }
    }
}
