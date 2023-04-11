import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack <Character> str= new Stack<>();
        char ch;String ans="";
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch=='*'){
                str.pop();
            }
            else if(ch !='*'){
                str.push(ch);
            }
        }
        for(int j=(str.size())-1;j>=0;j--){
            ans = (str.pop())+ans;
        }
        return (ans);
    }
}