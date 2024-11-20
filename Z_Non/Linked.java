import java.util.*;
public class Linked{
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

    public static class BuildTree{
        public static int idx = -1;
        public static Node buildTree(int a[]){
            idx++;
            if(a[idx] == -1){
                return null;
            }

            Node newNode = new Node(a[idx]);
            newNode.left = buildTree(a);
            newNode.right = buildTree(a);
            return newNode;
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
        int a[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BuildTree b = new BuildTree();
        Node root = b.buildTree(a);
        System.out.println(root.data);
        // System.out.println(b.count(root));
        b.kLevelData(root, 1, 2);
        System.out.println();
    }
}