//BST => take O(h) time for serching (h = height of the tree)
//use 'inorder treversal' which give always sorted values

import java.util.*;
public class _01Basics{

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


    //insertion function
    public static Node insertion(Node root, int val){
        //Base case
        if(root == null){
            root = new Node(val);
            return root;
        }

        //if root node have the value the insert in their left and right child
        if(root.data > val){    // value is small then insert in left part
            root.left = insertion(root.left, val);
        }

        else{
            root.right = insertion(root.right, val);
        }

        return root;
    }



    //inorder treversal => print / check the values
    public static void inorder(Node root){ //O(h)
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }



    //serch in Bst
    public static boolean isPresent(Node root, int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }

        if(key < root.data){
           return isPresent(root.left, key);
        }
        else{
           return isPresent(root.right, key);
        }

        
    }



    public static void main(String[] args) {
        int values[] = {4,9,2,6,3,1,5,8,7};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insertion(root, values[i]);
        }

        inorder(root);
        System.out.println();

        System.out.println(isPresent(root, 10));
    }
}