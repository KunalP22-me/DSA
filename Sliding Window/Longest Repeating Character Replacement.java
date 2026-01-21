//Problem 424 Leetcode

import java.util.HashMap;

class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqs = new HashMap<>();
        int res = 0, i = 0, maxFreq = 0;

        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            freqs.put(c, freqs.getOrDefault(c, 0) + 1);
            maxFreq = Math.max(maxFreq, freqs.get(c));

            while ((j - i + 1) - maxFreq > k) {
                char left = s.charAt(i);
                freqs.put(left, freqs.get(left) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }

//or

class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i=0,maxi=Integer.MIN_VALUE,windowSize=0,maxFreq=0;
        for(int j=0;j<s.length();j++) {
            char ch =s.charAt(j);
            freq[ch-'A']++;
            maxFreq = Math.max(maxFreq,freq[ch-'A']);
            windowSize = j-i+1;
            while(windowSize-maxFreq > k) {
                freq[s.charAt(i)-'A']--;
                i++;
                windowSize=j-i+1;
            }
            maxi = Math.max(maxi,windowSize);
        }
        return maxi;
    }
}

}
