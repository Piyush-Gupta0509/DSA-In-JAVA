package Trie;

import java.util.*;

public class Implementation {

    static class Node {
        private char ch;
        private boolean isEnd;
        private HashMap<Character, Node> children;

        Node(char ch) {
            this.ch = ch;
            this.children = new HashMap<>();
            this.isEnd = false;
        }

        boolean hasChild(char ch) {
            return this.children.containsKey(ch);
        }

        Node getChild(char ch) {
            return this.children.get(ch);
        }

        Node addChild(char ch) {
            Node child = new Node(ch);
            this.children.put(ch, child);
            return child;
        }

        void endOfWord() {
            this.isEnd = true;
        }

        void isNotEnd() {
            this.isEnd = false;
        }
    }

    static class Trie {
        Node root;

        Trie() {
            root = new Node('-');
        }

        void Insert(String str) {
            Node ptr = root;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ptr.hasChild(ch)) {
                    ptr = ptr.getChild(ch);
                } else {
                    ptr = ptr.addChild(ch);
                }
            }
            ptr.endOfWord();
        }

        boolean search(String str) {
            Node ptr = root;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ptr.hasChild(ch)) {
                    ptr = ptr.getChild(ch);
                } else {
                    return false;
                }
            }
            return ptr.isEnd;
        }

        void remove(String str) {
            Node ptr = root;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ptr.hasChild(ch)) {
                    ptr = ptr.getChild(ch);
                } else {
                    return;
                }
            }
            ptr.isNotEnd();
        }

        boolean startsWith(String str) {
            Node ptr = root;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                if (ptr.hasChild(ch)) {
                    ptr = ptr.getChild(ch);
                } else {
                    return false;
                }
            }
            return true;
        }

        
    }

    public static void main(String[] args) {
        Trie obj = new Trie();

        obj.Insert("apple");
        obj.Insert("bank");
        obj.Insert("apples");
        obj.Insert("ban");
        obj.Insert("app");
        obj.Insert("bat");
        obj.Insert("zeee");
        obj.Insert("omega");
        obj.remove("app");

        System.out.println(obj.search("app"));
        System.out.println(obj.search("ap"));
        System.out.println(obj.startsWith("ap"));
        
    }

}
