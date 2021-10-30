class Solution {
    public int findGCD(int[] nums) {
   //     if(nums.length==2) return GCD(nums[0],nums[1]);
        int min=1000;
        int max=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        System.out.println(min);
        System.out.println(max);
        return GCD(min,max);
    }
    private int GCD(int min,int max){
        if(min==1 || max==1) return 1;
        if(min!=0 && (max%min)==0) return min;
        for(int i=1+min/2; i>1; i--)
        {
            if(min%i ==0 && max%i ==0) return i;
        }
        return 1;
    }
}