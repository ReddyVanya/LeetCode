class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] list = new int[26];
        int count = 0;
        for(char ch : s.toCharArray())
        {
            list[ch-'a']++;
        }
        for(int i=0; i<26;i++)
        {
            if(list[i]!=0 && count==0) count=list[i];
            if(list[i]!=0 && list[i]!=count) return false;
        }
        return true;
    }
}
  