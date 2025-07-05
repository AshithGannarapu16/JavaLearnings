import  java.util.*;
public class StackExample{
    public static class Solution {
    public String solve(String A) {
        int N=A.length();
        Stack <Character> st=new Stack<>();
        for(int i=0;i<N;i++){
           char ch=A.charAt(i);
           if(!st.isEmpty() && st.peek()==ch){
               st.pop();
           }else{
               st.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder  ();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
       return sb.reverse().toString();
        
    }
}

    public static void main(String[] args) {
        Solution sol = new Solution();
        String A = "abbaca";
        String result = sol.solve(A);
        System.out.println(result); // Output: "ca"
    }


}