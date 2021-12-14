package Main;

import java.util.ArrayList;
import java.util.List;

public class q22 {
    public static void main() {
        List<String> str;
        str =  generateParenthesis(3);
        for (String s : str) {
            System.out.println(s);
        }
    }

//    public void main(String[] args) {
//
//    }
//    public static List<String> generateParenthesis(int n) {
//        // TC - O(pow(2, 2n)), SC - O(n)
//        List<String> res = new ArrayList<>();
//        dfs(res, new StringBuilder(), n, n, n);
//        return res;
//    }
//
//    public static void dfs(List<String> res, StringBuilder sb, int left, int right, int n) {
//        if(left == 0 && right == 0) {
//            res.add(sb.toString());
//            return;
//        }
//
//        if(left > 0) {
//            sb.append("(");
//            dfs(res, sb, left - 1, right, n);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//
//        if(right > left) {
//            sb.append(")");
//            dfs(res, sb, left, right - 1, n);
//            sb.deleteCharAt(sb.length() - 1);
//        }
//    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        findParenthesis(ans, "(", 1, 0, n);
        return ans;
    }
    public static void findParenthesis(List<String> ans, String res, int o, int c, int n) {
        if(res.length() == 2 * n) {
            ans.add(res);
            return;
        }
        if(o < n) findParenthesis(ans, res + "(", o + 1, c, n);
        if(c < o) findParenthesis(ans, res + ")", o, c + 1, n);
    }
}
