class Solution {
    public String addBinary(String a, String b) {
        int al = a.length();
        int bl = b.length();
        Stack<Character> stacka = new Stack<>();
        Stack<Character> stackb = new Stack<>();
        Stack<Character> stackc = new Stack<>();
        if(al>bl)
        {
            while(al-bl>0)
            {
                stackb.push('0');
                bl++;
            }
        }
        if(bl>al)
        {
            while(bl-al>0)
            {
                stacka.push('0');
                al++;
            }
        }
        for(char ch:a.toCharArray())
        {
            stacka.push(ch);
        }
        for(char ch:b.toCharArray())
        {
            stackb.push(ch);
        }
        int carry=0;
        while(!stacka.isEmpty() && !stackb.isEmpty())
        {
            if(stacka.peek()=='1' && stackb.peek()=='1')
            {  
                if(carry==0) stackc.push('0');
                if(carry==1) stackc.push('1');
                System.out.println("1");
                carry=1;
                
            }
            if((stacka.peek()=='1' && stackb.peek()=='0') || (stackb.peek()=='1' && stacka.peek()=='0'))
            {
                if(carry==0) stackc.push('1');
                if(carry==1) stackc.push('0');
                System.out.println("2");
            }
            if(stacka.peek()=='0' && stackb.peek()=='0')
            {
                if(carry==0) stackc.push('0');
                if(carry==1)
                {
                    stackc.push('1');
                    carry=0;
                }
            }
            stacka.pop();
            stackb.pop();
        }
        if(carry==1) stackc.push('1');
        StringBuilder sb = new StringBuilder();
        while(!stackc.isEmpty())
        {
            sb.append(stackc.pop());
        }
        return sb.toString();
    }
}