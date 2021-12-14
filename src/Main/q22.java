package Main;

import java.util.ArrayList;
import java.util.List;

public class q22 {
    public List<String> generateParenthesis(int n) {
        // TC - O(pow(2, 2n)), SC - O(n)
        List<String> res = new ArrayList<>();
        dfs(res, new StringBuilder(), n, n, n);
        return res;
    }

    private void dfs(List<String> res, StringBuilder sb, int left, int right, int n) {
        if(left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }

        if(left > 0) {
            sb.append("(");
            dfs(res, sb, left - 1, right, n);
            sb.deleteCharAt(sb.length() - 1);
        }

        if(right > left) {
            sb.append(")");
            dfs(res, sb, left, right - 1, n);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
