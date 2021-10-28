class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while(temp!=null)
        {
            stack.push(temp.val);
            temp=temp.next;
        }
        while(!stack.isEmpty())
        {
            if(stack.peek()!=head.val) return false;
            else
            {
                stack.pop();
                head=head.next;
            }
        }
        return true;
    }
}