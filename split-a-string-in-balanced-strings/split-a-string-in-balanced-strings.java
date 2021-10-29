class Solution {
    public int balancedStringSplit(String s) {
        int l=0;
        int r=0;
        int b=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='L') l++;
            if(ch=='R') r++;
            if(l==r) b++;
        }
        return b;
    }
}