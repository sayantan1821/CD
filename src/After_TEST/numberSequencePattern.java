// Josh Technology Coding Problem Q1
// Question - https://drive.google.com/file/d/1WershFfFVJs43obaLIg1GHxDHmYrwz8s/view?usp=sharing

package After_TEST;

import java.util.Stack;

public class numberSequencePattern {
    public static void main(String[] args) {
        String s = "122334555";
        System.out.println(stringSequence(s));
    }

    private static String stringSequence(String s) {
        Stack<charObject> charStack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(charStack.empty() || charStack.peek().c != ch) {
                charObject co = new charObject();
                co.c = ch;
                co.count = 1;
                charStack.push(co);
            } else {
                charObject tempObj = charStack.pop();
                tempObj.count++;
                charStack.push(tempObj);
            }
        }
        String ans = "";
        for(charObject obj : charStack) {
            ans = ans + obj.c + obj.count;
        }
        return ans;
    }
}
class charObject {
    char c;
    int count;
}
