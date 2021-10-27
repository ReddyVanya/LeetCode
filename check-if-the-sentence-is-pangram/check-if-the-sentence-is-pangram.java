class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] list = new int[26];
        if(sentence.length()<26) return false;
        for(char ch:sentence.toCharArray())
        {
            list[ch-'a']++;
        }
        for(int i=0; i<26; i++)
        {
            if(list[i]==0) return false;
        }
        return true;
    }
}