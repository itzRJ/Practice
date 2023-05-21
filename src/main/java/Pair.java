package main.java;

import java.util.Comparator;

public class Pair implements Comparator<Pair> {
    int index;
    int weight;
    Pair f, s;

    public Pair(int index, int weight) {
        this.index = index;
        this.weight = weight;
    }

    @Override
    public int compare(Pair o1, Pair o2) {
        return f.weight - s.weight;
    }
}
