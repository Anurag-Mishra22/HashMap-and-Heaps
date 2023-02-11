// You are given 2 arrays a1 and a2 of size n1 and n2 respectively.

// You are required to print all the elements of a2 which are also present in a1 (in order of their occurence in a2).

// Make sure to not print duplicates (a2 may have the same value present multiple times).

// Say, the given arrays are as shown in figure 1.

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.OverlayLayout;

public class GetCommonElementOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();

        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : a1) {
            if (hm.containsKey(val)) {
                int oldFrequency = hm.get(val);
                int newFrequency = oldFrequency + 1;
                hm.put(val, newFrequency);
            } else {
                hm.put(val, 1);
            }
        }

        for (int val : a2) {
            if (hm.containsKey(val)) {
                System.out.println(val);
                hm.remove(val);
            }
        }
    }

}

// TIME COMPLEXITY- O(n)
// SPACE COMPLEXITY- O(n) where n=number of entities in the hashmap.
