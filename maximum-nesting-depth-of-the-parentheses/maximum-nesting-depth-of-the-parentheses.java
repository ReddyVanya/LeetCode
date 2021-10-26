class Solution {
    public int maxDepth(String s) {
        if(s.isEmpty()) return 0;
        int depth = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='(') count++;
            if(ch==')') count--;
            else{
                if(count>depth) depth=count;
            }
            System.out.println(depth);
        }
        return depth;
    }
}