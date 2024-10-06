//for deleat we have three case
//case-1 := deleted node = leaf node (so it return the null value to the parent directly)
//case-2 := one child = (so we connect its perent node to its child node hence it will delet autometicaly)
//case-3 := two child = (find the indoder succeser and replace with it so autometicaly case-1 || case-2 will apply)

// inorder succeser = left most node of right subtree

import java.util.*;
public class _02Delete{

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
            root = new Node(val);
            return root;
        }

        if(val < root.data){
            //call for left part
            root.left = insert(root.left, val);
        }

        else{
            //call for right part
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }




    //delete function
    public static Node delNode(Node root, int key){
        //if value is small
        if(key < root.data){
            root.left = delNode(root.left, key);
        }

        //if value is greater
        else if(key > root.data){
            root.right = delNode(root.right, key);
        }

        //if it is equal
        else{
            //case -1
            if(root.left == null && root.right == null){
                return null;
            }

            //case-2
            if(root.left == null){
                return root.right;
            }

            else if(root.right == null){
                return root.left;
            }

            //case-3
            else{
                Node is = inorderSucceser(root.right);
                root.data = is.data;
                root.right = delNode(root.right, is.data);
            }
        }
        return root;
    }


    //inorder succeser fun
    public static Node inorderSucceser(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }
    

    public static void main(String args[]){
        int value[] = {8,6,10,3,5,1,4,11,14};
        Node root = null;

        for(int i=0; i<value.length; i++){
            root = insert(root, value[i]);
        }

        inorder(root);
        System.out.println();

        delNode(root, 10);
        inorder(root);
        System.out.println();
    }
}
