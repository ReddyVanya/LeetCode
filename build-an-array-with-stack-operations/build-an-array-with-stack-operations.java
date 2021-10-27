class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> stack = new Stack<>();
        int j=0;
        for(int i=1; i<=target[target.length-1]; i++)
        {
            if(i<target[j])
            {
                stack.push("Push");
                stack.push("Pop");
            }
            if(i==target[j])
            {
                stack.push("Push");
                j++;
            }
        }
        return stack;
    }
}