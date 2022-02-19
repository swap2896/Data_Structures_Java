public class singlelinked {
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
    public void insert(int pos,int element)
    {
        Node newnode=new Node(element);
        if(pos==0) {
            if (head == null) {
                newnode.next = null;
                head = newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }
        }
        else if(head==null && pos!=0)
        {
            System.out.println("Not a valid position! Please input a proper position");
        }
        else if(pos==1 && head.next==null)
        {
            head.next=newnode;
            newnode.next=null;
        }
        else{
            int count=0;
            Node current=head;
            Node prev=null;
            while(count+1<=pos && current!=null)
            {
                prev=current;
                current=current.next;
                count++;
            }
            if(count==pos) {
                newnode.next = current;
                prev.next=newnode;
            }
            else{
                System.out.println("Not a valid position! Please input a proper position");
            }

        }
    }

    public void delete(int pos)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
        }
        else if(pos==0)
        {
            Node temp=head;
            System.out.println("Deleted element is: "+temp.data);
            head=temp.next;
        }
        else if(head.next==null)
        {
            if(pos==0)
            {
                System.out.println("Deleted element is: "+head.data);
                head=null;
            }
            else{
                System.out.println("Not a valid position! Please input a proper position");
            }
        }
        else{
            Node current=head;
            int count=0;
            Node prev=null;
            while(count+1<=pos && current!=null)
            {
                prev=current;
                current=current.next;
                count++;

            }
            if(count==pos && current!=null)
            {
                System.out.println("Deleted element is : "+current.data);
                Node temp=current.next;
                prev.next=temp;
            }
            else{
                System.out.println("Not a valid position! Please input a proper position");
            }

        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");

        }
        else{
            Node current=head;
            while(current.next!=null)
            {
                System.out.print(current.data+" -> ");
                current=current.next;
            }
            System.out.print(current.data);
        }
    }
}
