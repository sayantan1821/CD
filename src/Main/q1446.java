package Main;

public class q1446 {
    public static void main() {
        System.out.println(maxPower("Leetcode"));
}
    public static int maxPower(String s) {
        if(s.length() == 1) return 1;
        int max = 0;
        int count = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i-1)) {
                if(count > max) max = count;
                count = 1;
            } else {
                count++;
            }
        }
        if(count > max) max = count;
        return max;
    }


}
