class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode Hd = head;
        while(head!=null)
        {
            count++;
            if(count%2==0) Hd=Hd.next;
            head=head.next;
        }
        return Hd;
    }
}