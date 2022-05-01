class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        int i = 0, n = intervals.length;
        List<int[] > curr = new ArrayList<>();
        
        while(i<n && intervals[i][1]<newInterval[0])
            curr.add(intervals[i++]);
        
        int[] m = newInterval;
        while(i<n &&  intervals[i][0]<=newInterval[1]){
            
            m[0] = Math.min(m[0],intervals[i][0]);
            m[1] = Math.max(m[1],intervals[i++][1]);
        }
        curr.add(m);
        
        while(i<n)
            curr.add(intervals[i++]);
        
        return curr.toArray(new int[curr.size()][2]);
    }
}