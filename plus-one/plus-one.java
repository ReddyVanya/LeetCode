class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        for(int i=digits.length-1; i>=0; i--)
        {
            if(digits[i]!=9 || carry!=1)
            {
                digits[i]=digits[i]+carry;
                carry=0;
            }
            else digits[i]=0;
        }
        if(carry==1)
        {
            int[] sum = new int[digits.length+1];
            sum[0]=1;
            for(int i=0; i<digits.length; i++)
            {
                sum[i+1]=digits[i];
            }
            return sum;
        }
        return digits;
    }
}