class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int[] finalp = new int[len];
        if(len==1) finalp[0]=prices[0];
        for(int i=0; i<len;i++)
        {
            finalp[i]=-1;
            for(int j=i+1; j<len; j++)
            {
                if(finalp[i]==-1 && prices[i]>=prices[j])
                {
                    finalp[i] = prices[i]-prices[j];
                }
            }
            if(finalp[i]==-1) finalp[i]=prices[i];
        }
        return finalp;
    }
}