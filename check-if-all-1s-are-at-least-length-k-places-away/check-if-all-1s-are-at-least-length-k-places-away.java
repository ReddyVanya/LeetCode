class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int check=0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==1) stack.push(i);
        }
        if(stack.isEmpty()) return true;
        int top = stack.pop();
        while(!stack.isEmpty())
        {
            if(top-stack.peek() <=k) return false;
            top=stack.pop();
        }
        return true;
    }
}