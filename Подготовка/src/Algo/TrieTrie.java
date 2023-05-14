package Algo;

/**
 * Prefix tree
* @author zhx
*/
public class TrieTrie {
  // Definition of node
  public static class TrieNode {
      // The number of nodes passed by when building the tree
      public int path;
      // Number of inserted strings
      public int end;
      // The path of the constructed tree
      public TrieNode[] nexts;
      public TrieNode(){
          path = 0;
          end = 0;
          // 26 letters of a to z directly corresponding
          nexts = new TrieNode[26];
      }
  }

  public static class Trie{
      private TrieNode root;
      public Trie(){
          root = new TrieNode();
      }
      // The operation of inserting a string to construct a prefix tree
      public void insert(String word){
          if(word == null){
              return;
          }
          char[] chs = word.toCharArray();
          TrieNode node = root;
          int index = 0;
          for (int i = 0; i < chs.length; i++) {
              //a -- 0, b --1, c -- 2, d --3, ... , z -- 25
              index = chs[i] - 'a';
              if(node.nexts[index] == null){
                  node.nexts[index] = new TrieNode();
              }
              node.path++;
              node = node.nexts[index];
          }
          node.end++;
      }

      // Delete the specified string
      public void delete(String word){
          if(search(word) == 0){
              return;
          }
          int index = 0;
          TrieNode node = root;
          char[] chs = word.toCharArray();
          for (int i = 0; i < chs.length; i++) {
              index = chs[i] - 'a';
              if(--node.nexts[index].path == 0){
                  node.nexts[index] = null;
                  return;
              }else{
                  node = node.nexts[index];
              }
          }
          node.end--;
      }

      // Find how many times this string has been inserted
      public int search(String word){
          if(word == null){
              return 0;
          }
          char[] chs = word.toCharArray();
          int index = 0;
          TrieNode node = root;
          for (int i = 0; i < chs.length; i++) {
              index = chs[i] - 'a';
              if(node.nexts[index] == null){
                  return 0;
              }
              node = node.nexts[index];
          }
          return node.end;
      }

      // Find the number of strings prefixed with pre
      public int prefixNumber(String pre){
          if(pre == null){
              return 0;
          }
          char[] chs = pre.toCharArray();
          int index = 0;
          TrieNode node = root;
          for (int i = 0; i < chs.length; i++) {
              index = chs[i] - 'a';
              if(node.nexts[index] == null){
                  return 0;
              }
              node = node.nexts[index];
          }
          return node.path;
      }
  }
  public static void main(String[] args) {
      Trie trie = new Trie();
      trie.insert("black");
      trie.insert("back");
      trie.insert("bread");
      trie.insert("brawl");
      trie.insert("ben");
      trie.insert("t");
      trie.insert("to");
      trie.insert("too");
      System.out.println(trie.search("black"));
      System.out.println(trie.search("back"));
      System.out.println(trie.search("bread"));
      System.out.println(trie.search("brawl"));
      System.out.println(trie.search("ben"));
      System.out.println(trie.search("t"));
      System.out.println(trie.search("to"));
      System.out.println(trie.search("too"));
      
      System.out.println("");
      
      System.out.println(trie.prefixNumber("black"));
      System.out.println(trie.prefixNumber("back"));
      System.out.println(trie.prefixNumber("bread"));
      System.out.println(trie.prefixNumber("brawl"));
      System.out.println(trie.prefixNumber("ben"));
      System.out.println(trie.prefixNumber("t"));
      System.out.println(trie.prefixNumber("to"));
      System.out.println(trie.prefixNumber("too"));

  }
}
