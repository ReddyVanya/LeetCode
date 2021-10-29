class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int able = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<students.length; i++)
        {
            queue.add(students[i]);
        }
        for(int i=0; i<sandwiches.length; i++)
        {
            int count=0;
            while(sandwiches[i]!=queue.peek())
            {
                queue.add(queue.remove());
                count++;
                if(count>students.length) return students.length-able;
            }
            if(sandwiches[i]==queue.peek())
            {
                queue.remove();
                able++;
            }
        }
        return students.length-able;
    }
}