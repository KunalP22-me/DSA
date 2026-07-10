//Problem 2956 Leetcode
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int l = Math.max(n, m);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < l; i++) {
            if (i < m) {
                set1.add(nums1[i]);
            }
            if (i < n) {
                set2.add(nums2[i]);
            }
        }

        int a1 = 0;
        int a2 = 0;

        for (int j = 0; j < l; j++) {
            if (j < m) {
                if (set2.contains(nums1[j])) {
                    a1++;
                }
            }
            if (j < n) {
                if (set1.contains(nums2[j])) {
                    a2++;
                }
            }
        }
        return new int[] { a1, a2 };
    }
}
