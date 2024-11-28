/*Trie => K-array tree
 * it sotre 'prifix' - 1 time
 * use -> like 'auto comple in google'
 */

import java.util.*;
public class _01Basic{
    public static class Node{
        Node child[] = new Node[26];
        boolean endOfWord = false;

        public Node(){
            //all index are null in starting
            for(int i=0; i<26; i++){
                child[i] = null;
            }
        }
    }

    //root node is always empty
    public static Node root = new Node();

    //add function
    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new Node();
            }
            curr = curr.child[idx];

        }
        curr.endOfWord = true;
    }

    public static boolean search(String s){
        Node curr = root;

        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            if(curr.child[idx] == null){
                return false;
            }
            curr = curr.child[idx];
        }

        return curr.endOfWord == true;
    }

    public static void main(String[] args) {
        String words[] = {"three", "the", "a","there", "their", "any"};
        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }
        System.out.println(search("any"));
        System.out.println(search("there"));
    }
}