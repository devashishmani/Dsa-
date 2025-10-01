import java.util.*;

class Solution {
    public int mostFrequentEven(int[] nums) {
        ArrayList<Integer> evens = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evens.add(nums[i]);
            }
        }

        if (evens.isEmpty()) {
            return -1; 
        }

        int mostFreq = evens.get(0);
        int maxFreq = 0;

      
        for (int i = 0; i < evens.size(); i++) {
            int val = evens.get(i);
            int freq = 0;

            for (int j = 0; j < evens.size(); j++) {
                if (evens.get(j) == val) {
                    freq++;
                }
            }

           
            if (freq > maxFreq || (freq == maxFreq && val < mostFreq)) {
                maxFreq = freq;
                mostFreq = val;
            }
        }

        return mostFreq;
    }
}
