//Problem 3345 Leetcode
class Solution {
    public int smallestNumber(int n, int t) {
        
        while(productOfDigits(n) % t != 0){
            n++;
        }
        return n;
    }

    private int productOfDigits(int num){
        int product = 1;

        while(num != 0){
            int d = num % 10;
            product *= d;
            num /= 10;
        }

        return product;
    }
}
