
// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are required to print the longest sequence of consecutive elements in the array (ignoring duplicates).

// Note -> In case there are two sequences of equal length (and they are also the longest), then print the one for which the starting point of which occurs first in the array.
// 1 <= n <= 30
// 0 <= n1, n2, .. n elements <= 15

// TC->O(N),SC->O(N)

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, true);
        }

        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int maxStartPoint = 0;
        int maxLength = 0;
        for (int val : arr) {
            if (map.get(val) == true) {
                int temporaryLength = 1;
                int temporaryStartPoint = val;

                while (map.containsKey(temporaryStartPoint + temporaryLength)) {
                    temporaryLength++;
                }
                if (temporaryLength > maxLength) {
                    maxStartPoint = temporaryStartPoint;
                    maxLength = temporaryLength;
                }
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.println(maxStartPoint + i);
        }
    }
}
