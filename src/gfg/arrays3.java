package gfg;

public class arrays3 {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maximumSubarray(arr));
    }

    private static int maximumSubarray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for(int i : nums) {
            sum = sum + i;
            if(sum > max) max = sum;
            if(sum < 0) sum = 0;
        }
        return max;
    }
}
