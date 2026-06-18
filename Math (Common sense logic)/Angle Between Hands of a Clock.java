//Problem 1344 Leetcode

class Solution {
    public double angleClock(int hour, int minutes) {
        // Hour hand moves 30° per hour and 0.5° per minute
        double hourAngle = 30.0 * hour + 0.5 * minutes;

        // Minute hand moves 6° per minute
        double minuteAngle = 6.0 * minutes;

        // Absolute angle difference
        double diff = Math.abs(hourAngle - minuteAngle);

        // Return smaller angle between the two hands
        return Math.min(diff, 360 - diff);
    }
}
