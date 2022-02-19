import java.util.ArrayList;

public class cicularqueue {
    int front = -1, rear = -1;
    int size=10;
    ArrayList<Integer> cq = new ArrayList<>(size);
    public void insert(int element)
    {
        if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
            cq.add(element);
        }
        else if((rear+1)%size==front)
        {
            System.out.println("Circular queue is full. Queue Overflow");
        }
        else if(rear==size-1 && front!=0)
        {
            rear=0;
            cq.set(rear,element);
        }
        else{
            if(front<=rear)
            {
                rear=(rear+1)%size;
                cq.add(element);
            }
            else{
                rear=(rear+1)%size;
                cq.set(rear,element);
            }

        }

    }
    public void delete()
    {
        if(front==-1 && rear==-1)
        {
            System.out.println("Circular queue empty");
        }
        else if(front == rear)
        {
            System.out.println("deleted element "+cq.get(rear));
            front=-1;
            rear=-1;
        }
        else{
            System.out.println("deleted element " + cq.get(front));
            if(front==size-1) {
                front = 0;
            }
            else{
                front = front + 1;

            }
        }
    }
    public void display()
    {
        int i=0;
        if(front==-1 && rear==-1)
        {
            System.out.println("Circular queue empty");
        }
        else if(front==rear)
        {
            System.out.println("Elements are "+cq.get(rear));
        }
        else{
            if(front>rear) {
                i=front;
                while (i < size) {
                    System.out.print("\t" + cq.get(i));
                    i++;
                }
                i=0;
                while (i <= rear) {
                    System.out.print("\t" + cq.get(i));
                    i++;
                }
            }
            else {
                i=front;
                while (i <= rear) {
                    System.out.print("\t "+cq.get(i));
                    i++;
                }
            }
        }
    }
}

