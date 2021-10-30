class Solution {
    public void duplicateZeros(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0) stack.push(0);
            stack.push(arr[i]);
        }
        while(!stack.isEmpty())
        {
            stk.push(stack.pop());
        }
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = stk.pop();
        }
        
    }
}