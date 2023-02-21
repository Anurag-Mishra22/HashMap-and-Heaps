import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// We are given an array of integers and we are also given an integer K. We have to return an arraylist of integers that tells us about the number of distinct elements in every window of size K. 
// 2,5,5,6,3,2,3,2,4,5,2,2,2,2,3,6

public class CountDistinctElementsinEveryWindowofSizeK {

    public static ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;

        while (i < k - 1) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            i++;
        }
        i--;
        int j = -1;
        while (i < arr.length - 1) {
            // accquire
            i++;
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            // work
            list.add(map.size());
            // release
            j++;
            int frequency = map.get(arr[j]);
            if (frequency == 1) {
                map.remove(arr[j]);
            } else {
                map.put(arr[j], frequency - 1);
            }

            i++;
            j++;
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = new int[scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();
        int k = scn.nextInt();
        ArrayList<Integer> ans = solution(arr, k);
        for (int a : ans) {
            System.out.print(a + " ");
        }
    }
}

// public static ArrayList<Integer> solution(int[] arr, int k) {
// //write your code here
// ArrayList<Integer> list = new ArrayList<>();
// HashMap<Integer,Integer> map = new HashMap<>();

// for(int i = 0; i<k-1;i++) {
// map.put(arr[i],map.getOrDefault(arr[i],0)+1);
// }

// for(int j=0;i=k-1;i<arr.length;) {
// map.put(arr[i],map.getOrDefault(arr[i],0)+1); //acquire

// list.add(map.size()); // work

// //release
// int freq = map.get(arr[j]);
// if(freq==1){
// map.remove(arr[j]);
// }else{
// map.put(arr[j],freq-1);
// }
// i++;
// j++;
// }

// return list;
// }
