class Solution {
    public String truncateSentence(String s, int k) {
        String[] list = s.split(" ");
        String gfg2 = list[0];
        
        for(int i=1; i<k; i++)
        {
            gfg2 = String.join(" ", gfg2, list[i]);
        }
        return gfg2;
    }
}