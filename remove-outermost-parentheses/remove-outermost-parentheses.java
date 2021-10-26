class Solution {
    public String removeOuterParentheses(String s) {
     //   String str = "";
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count==0) count++;
                else{
                    str.append(ch);
                    count++;
                }
            }
            if(ch==')'){
                if(count==1) count--;
                else{
                    str.append(ch);
                    count--;
                }
            }
        }
        return str.toString();
    }
}