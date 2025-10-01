import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            int freq = 0;

           
            for (int j = 0; j < n; j++) {
                if (nums[j] == val) {
                    freq++;
                }
            }

           
            if (freq > n / 3 && !result.contains(val)) {
                result.add(val);
            }
        }

        return result;
    }
}
