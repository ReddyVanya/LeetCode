class Solution {
    public String removeDuplicates(String s) 
    {
        Stack<Character> stack = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i=s.length()-1; i>=0;i--)
        {
            if(!stack.isEmpty()&&s.charAt(i)==stack.peek()) stack.pop();
            else stack.push(s.charAt(i));
        }
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        return str.toString();
    }
}