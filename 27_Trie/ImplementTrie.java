class Node{
    boolean eow;
    Node[] children;
    public Node(){
        eow = false;
        children = new Node[26];
    }
}
public class Trie {
    static Node root;
    public Trie() {
        root = new Node();
    }
    public static void insert(String word) {
       Node curr = root;
        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr=curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String word) {
       Node curr = root;
        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}
