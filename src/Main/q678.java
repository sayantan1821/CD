package Main;

public class q678 {
    public static int nthMagicalNumber(int n, int a, int b) {

        long A = a, B = b;
        long mod = (long)(Math.pow(10,9)+7);


        long left = Math.min(a,b);
        long right = (long)n*left;

        while (B > 0) {
            long tmp = A;
            A = B;
            B = tmp % B;
        }

        while (left < right) {
            long m = left+(right-left)/2;
            long lcm = (a*b)/A;
            if ((m / a) + (m / b) - (m / lcm) < n) left = m + 1;
            else right = m;
        }
        return (int)(left % mod);
    }
}
