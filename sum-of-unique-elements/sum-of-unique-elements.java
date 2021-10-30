class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            count[nums[i]]++;
            if(count[nums[i]]==1){
                sum = sum+nums[i];
            }
            
            if(count[nums[i]]==2){
                sum = sum-nums[i];
            }
        }
        return sum;
    }
}