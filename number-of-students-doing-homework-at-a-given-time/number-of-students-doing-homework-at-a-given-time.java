class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count=0;
        for (int i=0; i<endTime.length; i++)
        {
            if((endTime[i] >= queryTime)&&(queryTime >= startTime[i])) count++;
        }
        return count++;
    }
}