class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return 1;
        if(stones.length==0) return 0;
        Arrays.sort(stones);
        int len = stones.length;
        System.out.println(stones[len-1]);
        if(stones[len-2]==0) return stones[len-1];
        if(stones[len-1]==stones[len-2])
        {
            stones[len-1]=0;
            stones[len-2]=0;
            return lastStoneWeight(stones);
        }

        stones[len-1]=stones[len-1]-stones[len-2];
        stones[len-2]=0;
        return lastStoneWeight(stones);

    }
}