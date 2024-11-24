// import java.util.*;
// public class Linked{

//     public static class Node{
//         int data;
//         Node left;
//         Node right;

//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static Node insert(Node root, int val){
//         if(root == null){
//             return new Node(val);
//         }

//         if(val < root.data){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }


//     public static void inorder(Node root ){
//         if(root == null){
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void leef(Node root, List<Integer> list){
//         if(root == null){
//             return;
//         }

//         list.add(root.data);

//         if(root.left == null && root.right == null){
//             System.out.println(list);
            
//         }

//         leef(root.left, list);
//         leef(root.right ,list);
//         list.remove(list.size()-1);
//     }

//     public static void main(String agrs[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i=0; i<n; i++){
//             a[i] = sc.nextInt();
//         }

//         Node root = null;
//         for(int i=0; i<n; i++){
//             root = insert(root, a[i]);
//         }

//         inorder(root);
//         System.out.println();
//         leef(root , new ArrayList<>());
//     }
// }


import java.util.*;
public class Linked{
    public static int GCD(int a, int b){
        int gcd = 1;
        if(a==0){
            gcd = b;
        }
        if(b==0){
            gcd = a;
        }

        for(int i=1; i<Math.min(a, b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        return gcd; 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
}