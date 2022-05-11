package gfg;

import java.util.Arrays;

public class arrays5 {

    public static void main(String[] args) {
        int[] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        System.out.println(chocolateDistribution(arr, m));
    }

    private static int chocolateDistribution(int[] arr, int m) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length - m + 1; i++) {
            if(arr[i + m - 1] - arr[i] < minDiff) minDiff = arr[i + m - 1] - arr[i];
        }
        return minDiff;
    }
}
