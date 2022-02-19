public class binary_seach_tree {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    Node root=null;

    public Node insertnode(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.data)
        {
            root.left=insertnode(root.left,key);
        }
        else if(key>root.data){
            root.right=insertnode(root.right,key);
        }
        return root;
    }

    public void inorderdisplay(Node root)
    {
        if(root!=null)
        {
            inorderdisplay(root.left);
            System.out.println(root.data);
            inorderdisplay(root.right);
        }
    }
    public void insert(int key)
    {
        root=insertnode(root,key);
    }
    public void inorder()
    {
        inorderdisplay(root);
    }
}