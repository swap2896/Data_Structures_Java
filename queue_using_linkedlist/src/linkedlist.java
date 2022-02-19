public class linkedlist {
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
        newnode.next=null;
        if(head==null && tail==null)
        {
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }
    public void display()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("Queue is empty");
        }
        else {
            while(current.next != null) {
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.print(current.data);
        }
    }
    public void delete() {
        Node del;
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            del = head;
            head = head.next;
            System.out.println("Deleted element is " + del.data);
        }
    }
}
