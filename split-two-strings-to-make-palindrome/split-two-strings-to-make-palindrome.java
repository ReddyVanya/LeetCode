class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()<2) return true;
        int flen = a.length()-1;
        int hflen = a.length()/2;
        for(int i=0; i<hflen; i++)
        {
            if((a.charAt(i)!=b.charAt(flen-i))&&(b.charAt(i)!=a.charAt(flen-i)))
            {
                if((a.charAt(i)!=a.charAt(flen-i))&&(b.charAt(i)!=b.charAt(flen-i))) return false;
                if(((a.charAt(i)!=a.charAt(flen-i))&&(b.charAt(hflen)!=b.charAt(flen-hflen)))||((b.charAt(i)!=b.charAt(flen-i))&&(a.charAt(hflen)!=a.charAt(flen-hflen)))) return false;
                
            }
        }
        return true;
    }
}