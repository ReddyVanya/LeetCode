class Solution {
    public int minDeletions(String s) {
        int count=0;
        int[] list = new int[26];
        
        for(char ch:s.toCharArray())
        {
            list[ch-'a']++;
        }
        Arrays.sort(list);
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<list.length; i++)
        {
            stack.push(list[i]);
        }
        
        int top = stack.pop();
        while(!stack.isEmpty())
        {
            if(stack.peek()==0 && top==0) return count;
            if(stack.peek()==top)
            {
                System.out.println("B");
                top=stack.pop()-1;
   //             System.out.println(top);
     //           System.out.println(stack.peek());
                count++;
                System.out.println(top);
            }
            if(!stack.isEmpty() && stack.peek()>top)
            {
                System.out.println("A");
                if(top!=0) count+=stack.peek()-top+1;
                if(top==0) count+=stack.peek();
                if(top!=0) top--;
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()<top)
            {
                System.out.println("A");
                top=stack.pop();
            }             
        }
        return count;
    }
}