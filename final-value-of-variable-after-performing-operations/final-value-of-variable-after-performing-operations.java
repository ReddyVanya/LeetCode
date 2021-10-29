class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int net=0;
        for(int i=0; i<operations.length; i++)
        {
            for(char ch:operations[i].toCharArray())
            {
                if(ch=='+') net=net+1;
                if(ch=='-') net=net-1;
            }
        }
        return net/2;
    }
}