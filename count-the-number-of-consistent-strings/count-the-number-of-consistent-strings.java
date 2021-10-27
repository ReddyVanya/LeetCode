class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] list = new int[26];
        int out = 0;
        for(char ch : allowed.toCharArray())
            list[ch-'a']++;
        for(int i=0; i<words.length; i++)
        {
            int count=0;
            for(char ch1:words[i].toCharArray())
            {
                if(list[ch1-'a'] != 0) count++;
            }
            if(count==words[i].length()) out++;
        }
        return out;
    }
}