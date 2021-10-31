class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for(int i=0; i<nums.length; i+=2)
        {
            len=len+nums[i];
        }   
        
        int[] out = new int[len];
        int i=0;
        int freq = 0;
        for(int j=1; j<nums.length; j+=2)
        {
            freq = freq+nums[j-1];
            while(i<freq)
            {
                out[i]=nums[j];
                i++;
            }
        }
        return out;
    }
}