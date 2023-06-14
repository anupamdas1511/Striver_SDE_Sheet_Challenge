public class Trie {


    //Initialize your data structure here
    private static final int ALPHABET_SIZE = 26;

    private static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;
        public TrieNode() {
            children = new TrieNode[ALPHABET_SIZE];
            isEndOfWord = false;
        }
    }

    private static TrieNode root;

    Trie() {
        //Write your code here
        root = null;
    }


    //Inserts a word into the trie

    public static void insert(String word) {
        //Write your code here
        if (root==null) {
            root = new TrieNode();
        }
        TrieNode temp = root;
        for (char ch : word.toCharArray()) {
            if (temp.children[ch-'a']==null) {
                temp.children[ch-'a'] = new TrieNode();
            }
            temp = temp.children[ch-'a'];
        }
        temp.isEndOfWord = true;
    }


    //Returns if the word is in the trie

    public static boolean search(String word) {
        //Write your code here
        if (root==null) return false;
        TrieNode temp = root;
        for (char ch : word.toCharArray()) {
            if (temp.children[ch-'a']==null)
                return false;
            else
                temp = temp.children[ch-'a'];
        }
        return temp.isEndOfWord;
    }

    
    //Returns if there is any word in the trie that starts with the given prefix

    public static boolean startsWith(String prefix) {
        //Write your code here
        if (root==null) return false;
        TrieNode temp = root;
        for (char ch : prefix.toCharArray()) {
            if (temp.children[ch-'a']==null)
                return false;
            else
                temp = temp.children[ch-'a'];
        }
        return true;
    }
}