import java.util.*;
public class Solution {
    // Stack Based Approach - Time Complexity O(n) & Space Complexity O(n)
    public int longestValidParenthesesUsingStack(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }
        return max;
    }

    // Optimal Two Traversal Approach - O(n) Time complexity & O(1) Space Complexity

    public int longestValidParentheses(String s) {
      int max=0;
        int open=0,close=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }
           else if(ch==')'){
                close++;
            }
            if(open==close){
                max=Math.max(max,2*close);
            }else if(close>open){
                open=close=0;
            }
        }
        open=close=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                open++;
            }else if(s.charAt(i)==')'){
                close++;
            }
            if(open==close){
                max=Math.max(max,2*open);
            }else if(close<open){
                open=close=0;
            }
        }
        return max;
    }
}
