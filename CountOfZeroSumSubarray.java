// 1. You are given an array(arr) of integers.
// 2. You have to find the count of all subarrays with sum 0.
// Input Format
// A number N
// arr1
// arr2.. N numbers
// 2,8,-3,-5,2,-4,6,1,2,1,-3,4

import java.util.HashMap;
import java.util.Scanner;

public class CountOfZeroSumSubarray {

    public static int solution(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = -1;
        int sum = 0;
        map.put(0, 1);
        while (i < arr.length - 1) {
            i++;
            sum += arr[i];

            if (map.containsKey(sum)) {
                count += map.get(sum);
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
}
