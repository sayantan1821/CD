package Main;

public class q1641 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countVowelStrings(n));
    }

    private static int countVowelStrings(int n) {
        int[][] t = new int[n + 1][5];
        for(int i = 0; i < t.length; i++) {
            for(int j = 0; j < t[0].length; j++) {
                if(i == 0 || j == t[0].length - 1) t[i][j] = 1;
            }
        }
        for(int i = 1; i < t.length; i++) {
            for(int j = t[0].length - 2; j >= 0; j--) {
                t[i][j] = t[i - 1][j] + t[i][j + 1];
            }
        }

        return t[n][0];
    }
}
