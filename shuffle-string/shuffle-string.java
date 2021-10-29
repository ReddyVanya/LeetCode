class Solution {
    public String restoreString(String s, int[] indices) {
        String[] list = new String[indices.length];
        int i=0;
        for(char ch:s.toCharArray())
        {
            list[indices[i]] = String.valueOf(ch);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<list.length; j++)
        {
            sb.append(list[j]);
        }
        return sb.toString();
    }
}