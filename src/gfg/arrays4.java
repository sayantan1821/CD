package gfg;

import java.util.HashMap;

public class arrays4 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }
}
