class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            smaller[i]=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<nums[i]) smaller[i]++;
            }
        }
        return smaller;
    }
}