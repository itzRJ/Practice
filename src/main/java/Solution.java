package main.java;

import java.util.*;

public class Solution {
    private static int getNoOfHouse(int[] house, int B) {
        // TODO: implement this method to determine the ruler name, given the kingdom.
        Arrays.sort(house);
        int res=0;
        for(int i=0;i<house.length;i++)
        {
            if(house[i] > B)
                break;
            B -= house[i];
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();

            for (int t = 1; t <= T; ++t) {
                int s = in.nextInt();
                int B = in.nextInt();
                int[] house = new int[s];
                for(int i=0;i<s;i++)
                    house[i] = in.nextInt();
                System.out.println("Case #" + t + ": " + getNoOfHouse(house, B));
            }
        }
    }
}
