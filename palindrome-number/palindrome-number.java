class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        int org = x;
        if(x==0) return true;
        if(x%10==0) return false;
        while(rev<x){
            rev = rev*10+(x%10);
           // System.out.println(rev);
            if(rev==x) return true;
            x = x/10;
            if(rev==x) return true;    
        }        
        return x==rev;
    }        
}