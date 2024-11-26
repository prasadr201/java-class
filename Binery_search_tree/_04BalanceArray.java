import java.util.*;
public class _04BalanceArray{

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            return new Node(val);
        }

        if(val < root.data){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
        }
        return root;
    }


    public static void inorder(Node root ){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node BBt(int a[] , int si, int ei){
        if(si > ei){
            return null;
        }

        int mid = (si+ei)/2;
        Node root = new Node(a[mid]);
        root.left = BBt(a, si, mid-1);
        root.right =  BBt(a,mid+1, ei);
        return root;
    }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Node root = BBt(a, 0, n-1);
        System.out.println(root.data);
        inorder(root);
        System.out.println();
    }
}