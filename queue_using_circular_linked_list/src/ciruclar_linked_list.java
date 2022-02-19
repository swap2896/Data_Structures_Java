public class ciruclar_linked_list {
    class Node{
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
    public void insert(int x)
    {
        Node newnode=new Node(x);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            tail.next=head;
        }
        else{
            newnode.next=head;
            tail.next=newnode;
            tail=newnode;

        }

    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Queue is empty");
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

    public void delete()
    {
        if(head==null)
        {
            System.out.println("Queue is empty");
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
