// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. The array is nearly sorted. Every element is at-max displaced k spots left or right to it's position in the sorted array. Hence it is being called k-sorted array.
// 4. You are required to sort and print the sorted array.

// Note -> You can use at-max k extra space and nlogk time complexity.
//2,3,1,4,6,7,5,8,9

import java.util.PriorityQueue;

public class SortKSortedArray {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 4, 6, 7, 5, 8, 9 };
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= k; i++) {
            pq.add(arr[i]);
        }

        for (int i = k + 1; k < arr.length; i++) {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        while (pq.size() > 0) {
            System.out.println(pq.remove());
        }
    }
}
