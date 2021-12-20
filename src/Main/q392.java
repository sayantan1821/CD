package Main;

import java.util.Stack;

public class q392 {
    public static void main() {
        String str = "3[a]2[bc]";
        System.out.println(decodeString(str));
    }
    public static String decodeString(String S) {
        Stack<Integer> counts = new Stack();
        Stack<String> results = new Stack();
        String res = "";
        int i = 0;
        while(i < S.length()) {
            if(Character.isDigit(S.charAt(i))) {
                int k = 0;
                while(Character.isDigit(S.charAt(i))) {
                    k = k * 10 + S.charAt(i) - '0';
                    i++;
                }
                counts.push(k);
            } else if(S.charAt(i) == '[') {
                results.push(res);
                res = "";
                i++;
            } else if(S.charAt(i) == ']') {
                StringBuilder str = new StringBuilder(results.pop());
                int count = counts.pop();
                for(int j = 0; j < count; j++) {
                    str.append(res);
                }
                res = str.toString();
                i++;
            } else {
                res = res + S.charAt(i);
                i++;
            }
        }
        return res;
    }
}
