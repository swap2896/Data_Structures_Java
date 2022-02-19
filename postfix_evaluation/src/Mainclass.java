import java.util.Scanner;
import java.util.Stack;

public class Mainclass {
    public static void evaluate(String s){
        Stack<Integer> stack=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                stack.push(Character.getNumericValue(ch));
            }
            else{
                int x=stack.pop();
                int y=stack.pop();

                switch(ch)
                {
                    case '+':
                        stack.push(y+x);break;
                    case '-':
                        stack.push(y-x);break;
                    case '/':
                        stack.push(y/x);break;
                    case '*':
                        stack.push(y*x);break;
                }
            }

        }
        System.out.println("Answer: "+(stack.pop()));


    }
    public static void main(String args[])
    {
        System.out.println("Enter a valid postfix expression");
        Scanner sc=new Scanner(System.in);
        String st=sc.next();
        evaluate(st);
    }
}
