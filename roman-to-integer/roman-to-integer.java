class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int[] val = new int[s.length()];
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='I') val[i]=1;
            if(s.charAt(i)=='V') val[i]=5;
            if(s.charAt(i)=='X') val[i]=10;
            if(s.charAt(i)=='L') val[i]=50;
            if(s.charAt(i)=='C') val[i]=100;
            if(s.charAt(i)=='D') val[i]=500;
            if(s.charAt(i)=='M') val[i]=1000;
        }
        for(int i=0; i<val.length-1; i++)
        {
            if(val[i]<val[i+1]) sum = sum-val[i];
            else sum = sum+val[i];
        }
        sum = sum+val[val.length-1];
        return sum;
    }
}