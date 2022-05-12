package gfg;

public class arrays6 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 10;
        System.out.println(rotatedArraySEarch(arr, key));
    }

    private static int rotatedArraySEarch(int[] a, int key) {
        int i = 0;
        for(i = 0; i < a.length - 1; i++) {
            if(a[i] > a[i + 1]) break;
        }
        rotate(a, i);
        int searchResult = binarySearch(a, key, 0, a.length - 1);
        if(searchResult == -1) return -1;
        int ans = searchResult - a.length + 1 + i;
        if(ans < 0) ans = a.length + ans;
        return ans;
    }
    public static void rotate(int[] a, int k) {
        reverse(a, 0, k);
        reverse(a, k + 1, a.length - 1);
        reverse(a, 0, a.length - 1);
    }
    public static void reverse(int[] a, int s, int e) {
        while(s < e) {
            int temp = a[s];
            a[s] = a[e];
            a[e] = temp;
            s++;
            e--;
        }
    }
    public static int binarySearch(int[] nums, int target, int si, int li) {
        int mid = (si + li) / 2;
        if(si <= li) {
            if(nums[mid] == target) return mid;
            if(nums[mid] > target) return binarySearch(nums, target, si, mid - 1);
            return binarySearch(nums, target, mid + 1, li);
        }
        return -1;
    }
}
