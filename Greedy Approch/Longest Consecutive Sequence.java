class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {

            // Start only if previous number doesn't exist
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                // Count consecutive numbers
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

//////or///

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int seq=1;
        int maxSeq=1;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]==nums[i]+1) seq++;
            //skip equal elements
            else if(nums[i]==nums[i+1]) continue;
            else seq=1;

            maxSeq=Math.max(seq,maxSeq);
        }

        return maxSeq;

    }
}
