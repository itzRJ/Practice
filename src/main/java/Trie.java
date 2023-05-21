package main.java;

import java.util.Comparator;

public class Trie {
    public char val;
    public int count;
    public boolean isEnd;
    public Trie[] ar = new Trie[26];

    public Trie() {
    }

    public Trie(char val)
    {
        this.val = val;
        this.count = 1;
        this.isEnd = false;
    }
}
