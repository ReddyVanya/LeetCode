class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode carry=new ListNode();
        carry.val = 0;
        ListNode sum = new ListNode();
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        sum.val = l1.val+l2.val+carry.val;
        if(sum.val>9)
        {
            carry.val = 1;
            sum.val=sum.val%10;
            if(l1.next==null && l2.next!=null)
            {
                sum.next = addTwoNumbers(carry,l2.next);
                return sum;
            }
            if(l2.next==null && l1.next!=null)
            {
                sum.next = addTwoNumbers(l1.next,carry);
                return sum;
            }
            if(l1.next==null && l2.next==null)
            {
                sum.next = carry;
                return sum;
            }
            if(l1.next!=null && l2.next!=null) l2.next.val = l2.next.val + carry.val;
        }
        sum.next = addTwoNumbers(l1.next,l2.next);
        return sum;
    }
}        
        
    
