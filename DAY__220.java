//Problem 2409 leetcode
class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int aa = days(arriveAlice);
        int la = days(leaveAlice);
        int ab = days(arriveBob);
        int lb = days(leaveBob);

        int max = Math.max(aa, ab);
        int min = Math.min(la, lb);
        
        if (max > min) return 0;

        return min - max + 1;
    }

    private int days(String date) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//12 month

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3));

        for (int i = 0; i < month - 1; i++) {
            day += months[i];
        }

        return day;
    }
}
