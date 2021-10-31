class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] doublenum = new int[2*nums.length];
        for(int i=0; i<nums.length; i++)
        {
            doublenum[i]=nums[i];
            doublenum[i+nums.length] = nums[i];
        }
        return doublenum;
    }
}