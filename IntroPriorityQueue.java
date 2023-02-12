import java.util.PriorityQueue;

public class IntroPriorityQueue {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // // highest priority is given to large value
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // By default highest priority is given to small value
        int[] ranks = { 22, 99, 3, 11, 88, 4, 1 };
        for (int val : ranks) {
            pq.add(val); // O(nlogn)
        }

        while (pq.size() > 0) {
            // O(1)
            System.out.println(pq.peek());
            pq.remove(); // O(nlogn);
        }
    }
}
