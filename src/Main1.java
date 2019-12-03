class Node{
    int val;
    Node left;
    Node right;

    public Node(int val) {
        this.left=null;
        this.right=null;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(1);
        Node d=new Node(2);
        Node e=new Node(1);
        Node f=new Node(2);
        Node g=new Node(1);
        Node h=new Node(2);
        a.left=b;
        b.left=c;
        a.right=e;
        b.right=f;
        f.right=g;
        f.left=h;
        System.out.println(IsproTree(a));
    }
    private static boolean IsproTree(Node root){
        int high=0;
        if(root==null)
            return true;
        int lefthigh=getTreehigh(root.left);
        int righthigh=getTreehigh(root.right);
        if(Math.abs(lefthigh-righthigh)>1){
            return false;
        }
        IsproTree(root.left);
        IsproTree(root.right);
        return true;
    }

    private static int getTreehigh(Node root) {
        int num=0;
        if(root==null){
            return num;
        }
        return Math.max(getTreehigh(root.left),getTreehigh(root.right))+1;
    }
}
