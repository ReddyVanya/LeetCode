class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i=0; i<word1.length; i++)
        {
            for(char ch:word1[i].toCharArray())
            {
                stack1.push(ch);
            }
        }
        for(int i=0; i<word2.length; i++)
        {
            for(char ch:word2[i].toCharArray())
            {
                stack2.push(ch);
            }
        }
        while(!stack1.isEmpty() && !stack2.isEmpty())
        {
            if(stack1.pop()!=stack2.pop()) return false;
        }
        if(!stack1.isEmpty() || !stack2.isEmpty()) return false;
        return true;
    }
}