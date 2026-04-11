//Problem 11 Leetcode

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) { 


            //simple form
            // maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));
                        
            int width = right - left;

            int minHeight;
            if (height[left] < height[right]) {
                minHeight = height[left];
            } else {
                minHeight = height[right];
            }

            int area = width * minHeight;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;        
    }
}
