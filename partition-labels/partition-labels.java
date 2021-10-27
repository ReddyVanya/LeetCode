class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] list = new int[26];
        int len=0;
        int ck=0;
        int[] check = new int[26];
        Stack<Integer> stack = new Stack<>();
        for(char ch:s.toCharArray())
        {
            list[ch-'a']++;
        }
        for(char ch:s.toCharArray())
        {  
            if(check[ch-'a']==0) ck=ck+list[ch-'a'];
            check[ch-'a']++;
            len++;
            if(ck==len)
            {
                stack.push(len);
                len=0;
                ck=0;
            }     
        }
        return stack;
    }
}