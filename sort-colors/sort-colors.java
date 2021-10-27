class Solution {
    public void sortColors(int[] nums) {
        //if(nums.length<2) return nums;
        int i0=0;
        int i1=0;
        int i2=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0) i0++;
            if(nums[i]==1) i1++;
            if(nums[i]==2) i2++;
        }
        if(i0>0)
        {
            for(int i=0; i<i0; i++) nums[i]=0;  
        }
        if(i1>0)
        {
            for(int i=i0; i<i1+i0; i++) nums[i]=1; 
        }
        if(i2>0)
        {
            for(int i=i0+i1; i<nums.length; i++) nums[i]=2;
        }
        
    }
}