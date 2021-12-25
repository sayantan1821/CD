package Main;

public class q227 {
    public static void main() {
        System.out.println(calculate("3+20"));
    }
     public static  int calculate(String s) {
         s = s.replaceAll("\\s", "");
         int ans = -9999;
         for(int i = s.length() - 2; i > 0; i--) {
             if(s.charAt(i) == '*') {
                 ans = (s.charAt(i - 1) - '0') * (s.charAt(i + 1) - '0');
             } else if(s.charAt(i) == '/') {
                 ans = (s.charAt(i - 1) - '0') / (s.charAt(i + 1) - '0');
             } else if(s.charAt(i) == '+') {
                 int p = i + 1;
                 int r = 0;
                 while(p < s.length() && Character.isDigit(s.charAt(p))) {
                     r = r * 10 + s.charAt(p) - '0';
                     p++;
                 }
                 ans = (s.charAt(i - 1) - '0') + r;
             } else if(s.charAt(i) == '-') {
                 ans = (s.charAt(i - 1) - '0') - (s.charAt(i + 1) - '0');
             } else continue;
             String strAns = String.valueOf(ans);
             int j = s.length();
             int k = 0;
             s = s.substring(0, s.length()-3);
             s = s + strAns;
             i--;
         }
         if(ans == -9999) {
             ans = Integer.parseInt(s);
         }
         return ans;
     }

//    public static int calculate(String s) {
//        int currNum=0;
//        char PrevSign='+';
//        int len=s.length();
//        Stack<Integer> st=new Stack<>();
//
//        for(int i=0;i<len;i++){
//            char ch=s.charAt(i);
//
//            if(Character.isDigit(ch)){
//                currNum=(currNum*10)+(ch-'0');
//
//            }
//            if(!Character.isDigit(ch)&&ch!=' ' || i==len-1){
//                if(PrevSign=='+'){
//                    st.push(currNum);
//                }
//                else if(PrevSign=='-'){
//                    st.push(-currNum);
//                }
//                else if(PrevSign=='*'){
//                    st.push(st.pop()*currNum);
//                }
//                else if(PrevSign=='/'){
//                    st.push(st.pop()/currNum);
//                }
//                PrevSign=ch;
//                currNum=0;
//            }
//        }
//            int sum=0;
//            while(!st.isEmpty()){
//                sum+=st.pop();
//            }
//            return sum;
//    }
}
