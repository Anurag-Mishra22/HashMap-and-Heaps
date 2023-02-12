import java.util.PriorityQueue;

// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. You are required to find and print the k largest elements of array in increasing order.
// 2 10 5 17 7 18 6 4
//SC-> K   and TC-O(NlogK)
public class KLargestElement {

    public static void main(String[] args) {
        int[] arr = { 2, 10, 5, 17, 7, 18, 6, 4 };
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (i < k) {
                pq.add(arr[i]);
            } else {
                if (arr[i] > pq.peek()) {
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }
    }
}
