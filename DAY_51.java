//Problem 56 Leetcode

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        // Take first interval values
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        // Step 2: Loop from second interval
        for (int i = 1; i < intervals.length; i++) {

            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            // If overlapping
            if (currStart <= prevEnd) {

                // Merge by updating end
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
