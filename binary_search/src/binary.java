import java.util.ArrayList;
import java.util.Scanner;

public class binary {
    public static void binaryseach(int arr[],int x){
        int first=0,last=9;
        int flag=0;
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(x==arr[mid])
            {
            flag=1;
            System.out.println("Element found at position "+mid);
            break;
            }
            if(x<arr[mid])
            {
                last=mid-1;
                mid=(first+last)/2;
            }
            else {
                first=mid+1;
                mid=(first+last)/2;
            }


        }
        if(flag==0)
        {
            System.out.println("Element not found");

        }
    }
    public static void main(String args[])
    {
        int[] arr =new int[10];
        int x;
        System.out.println("Enter the array elements in sorted order");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search");
        x=sc.nextInt();
        binaryseach(arr,x);

    }
}
