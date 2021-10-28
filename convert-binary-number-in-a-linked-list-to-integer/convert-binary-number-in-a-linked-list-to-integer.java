class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        int sum =0;
        while(head!=null)
        {
            sum = sum*2 + head.val;
            head=head.next;
        }
        return sum;
    }
}