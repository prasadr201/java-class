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
    }

    public static void main(String[] args) {
        String words[] = {"three", "the", "a", "their", "any"};
        for(int i =0; i<words.length; i++){
            insert(words[i]);
        }
    }
}