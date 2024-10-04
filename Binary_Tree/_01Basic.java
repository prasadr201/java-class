//Binary Tree => Hirarcial data , at most 2 child
//Tree traversal => 1.inorder      2.preorder     3.Postorder

//preOrder tree  O(n)
import java.util.*;
public class _01Basic{

    //tree contains node
    public static class Node{
        int data;
        Node left; //left child
        Node right;  //right child

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    //Binary Search tree class => contain the class
    public static class BinaryTree{
        public static int indx = -1;  //starting index at -1
        
        //function wich return node
        public static Node binaryTree(int node[]){
            indx++;  //take the index at next one
            if(node[indx] == -1){   //contain null node
                return null;
            }

            //create new node
            Node newNode = new Node(node[indx]);
            newNode.left = binaryTree(node);
            newNode.right = binaryTree(node);

            return newNode;
        }
    }

    //print in inorder
    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }



    //print in inorder
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
       
        inorder(root.right);
    }


    //print in inorder
    public static void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
       
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();   //create object for binary search class
        Node root = tree.binaryTree(node);
        // System.out.println(root.data);

        preorder(root);
        System.out.println();

        inorder(root);
        System.out.println();

        postorder(root);
        System.out.println();
    }
}