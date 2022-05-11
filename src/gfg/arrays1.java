package gfg;

public class arrays1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4};
        maximumMinimumElement(arr);
    }

    private static void maximumMinimumElement(int[] arr) {
        int max = arr[0], min = arr[0];
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("maximum -" + max);
        System.out.println("minimum -" + min);
    }
}
