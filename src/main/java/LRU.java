package main.java;

import java.util.HashMap;
import java.util.LinkedList;

public class LRU {
    HashMap<Integer, Integer> map = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<>();
    int cap;

    public LRU(int capacity) {
        cap = capacity;
    }

    public int get(int key) {
        if(map.containsKey(key))
        {
            int res= map.get(key);
            list.removeFirstOccurrence(key);
            list.add(key);
            return res;
        }
        return -1;
    }

    public void set(int key, int value) {
        if(map.containsKey(key))
        {
            map.put(key, value);
            list.removeFirstOccurrence(key);
            list.add(key);
        }
        else
        {
            if(map.size() < cap)
            {
                map.put(key, value);
                list.add(key);
            }
            else
            {
                int k = list.get(0);
                list.remove(0);
                map.remove(k);
                map.put(key, value);
                list.add(key);
            }
        }
    }
}
