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


    //Level order  => i.e BFS
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();

            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }

            else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //height of the tree  => we find the height of the child node and then return the maximum of left and right and then add 1
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);  //calculate the left height
        int rh = height(root.right); //calculate the right height

        return Math.max(lh, rh)+1;
    }

    //count the no. of nodes in the tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);
        return (lc + rc)+1;
    }

    
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lc = sum(root.left);
        int rc = sum(root.right);
        return root.data+lc+rc;
    }

    public static void kLevelData(Node root, int level , int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data + " ");
        }

        kLevelData(root.left, level+1, k);
        kLevelData(root.right, level+1, k);
    }
}

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int node[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();   //create object for binary search class
        Node root = tree.binaryTree(node);
        // System.out.println(root.data);

        tree.preorder(root);
        System.out.println();

        tree.inorder(root);
        System.out.println();

        tree.postorder(root);
        System.out.println();

        tree.levelOrder(root);
        System.out.println();

        System.out.println("height of the tree is = " + tree.height(root));
        
        System.out.println("no. of nodes in the tree = " + tree.count(root));

        System.out.print("sum of nodes in the tree = " + tree.sum(root));

        
        System.out.println("sum of nodes in the tree = " );
        tree.kLevelData(root,1,3);
        System.out.println();

    }
}