class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<strs[0].length(); i++)
        {
            for(int j=1; j<strs.length; j++)
            {
                if(strs[j].length()<i+1) return str.toString();
                if(strs[j].charAt(i)!=strs[0].charAt(i)) return str.toString();
            }
            str.append(strs[0].charAt(i));
        }
        return str.toString();
    }
}