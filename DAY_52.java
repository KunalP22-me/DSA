//Problem 57 Leetcode

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> res = new ArrayList<>();
        boolean Insert = false;
        int ni = newInterval[0];

        //Insert process
        for (int j = 0; j < intervals.length; j++) {
            int start = intervals[j][0];

            if(Insert==false && start>=ni){
                res.add(newInterval);
                Insert = true;
            }
            res.add(intervals[j]);
        }

        if (Insert==false) {
            res.add(newInterval);
        }

        ArrayList<int[]> result = new ArrayList<>();


        // Take first interval values
        int prevStart = res.get(0)[0];
        int prevEnd =  res.get(0)[1];

        for (int i = 1; i < res.size(); i++) {

            int currStart =  res.get(i)[0];
            int currEnd =  res.get(i)[1];

            if (currStart <= prevEnd) {

                prevEnd = Math.max(prevEnd, currEnd);

            } else {

                // Add previous interval to result
                result.add(new int[]{prevStart, prevEnd});

                // Move to next interval
                prevStart = currStart;
                prevEnd = currEnd;
            }
        }

        // Add last interval
        result.add(new int[]{prevStart, prevEnd});

        return result.toArray(new int[result.size()][]);
    }
}
