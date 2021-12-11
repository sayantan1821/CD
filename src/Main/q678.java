package Main;
//https://leetcode.com/problems/nth-magical-number/discuss/1622336/JAVA-or-Binary-Search-or-Detailed-Explanation-Using-Image
public class q678 {
    public static int nthMagicalNumber(int n, int a, int b) {
        int sm = a;
        if (b < a) sm = b;
        int i = sm,c = 0;
        int ans = 0, mod = 1000000007;
        n = n % mod;
        while(c < n) {
            if(i % a == 0 || i % b == 0 ) {
                c++;
                ans = i;
                i++;
            } else i++;
        }
        return (ans) % mod;
    } //time limit exceed
//    public static int nthMagicalNumber(int n, int a, int b) {
//
//        long A = a, B = b;
//        long mod = (long)(Math.pow(10,9)+7);
//
//
//        long left = Math.min(a,b);
//        long right = (long)n*left;
//
//        while (B > 0) {
//            long tmp = A;
//            A = B;
//            B = tmp % B;
//        }
//
//        while (left < right) {
//            long m = left+right/2;
//            long lcm = (a*b)/A;
//            if ((m / a) + (m / b) - (m / lcm) < n) left = m + 1;
//            else right = m;
//        }
//        return (int)(left % mod);
//    }
}


