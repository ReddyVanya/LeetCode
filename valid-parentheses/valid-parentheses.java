class Solution {
    public boolean isValid(String s) {
        if(s==null) return true;
        if(s.length()%2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{') stack.push(ch);
            if(ch==')' || ch==']' || ch=='}'){
                if(stack.isEmpty()) return false;
                if((ch==')' && stack.peek() !='(') ||(ch==']' && stack.peek() != '[')||(ch=='}' && stack.peek() !='{')) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}