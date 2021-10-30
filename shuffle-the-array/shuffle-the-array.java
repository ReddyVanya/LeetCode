class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] list = new int[2*n];
        for(int i=0; i<n; i++)
        {
            list[2*i]=nums[i];
            list[2*i+1]=nums[n+i];
        }
        return list;
    }
}