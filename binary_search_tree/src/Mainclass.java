public class Mainclass {
    public static void main(String args[])
    {
        binary_seach_tree tree=new binary_seach_tree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();

    }
}
