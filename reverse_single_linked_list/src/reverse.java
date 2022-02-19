public class reverse {
    static Node head;
    static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void printList(Node node)
    {
        System.out.println();
        while(node.next!=null)
        {
            System.out.print(node.data+" -> ");
            node=node.next;
        }
        System.out.print(node.data);
    }

    void reverselist(Node node)
    {
        Node curr=node;
        Node prev=null;
        Node next=null;

        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node=prev;

        printList(node);
    }

    public static void main(String args[])
    {
        reverse rl=new reverse();
        rl.head=new Node(10);
        rl.head.next=new Node(20);
        rl.head.next.next=new Node(30);
        rl.head.next.next.next=new Node(40);
        rl.head.next.next.next.next=new Node(50);
        rl.head.next.next.next.next.next=new Node(60);

        rl.printList(head);
        rl.reverselist(head);

    }
}
