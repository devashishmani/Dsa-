class Solution {
    public int minStartValue(int[] nums) {
        int prefix = 0;
        int minPrefix = Integer.MAX_VALUE;

        for (int num : nums) {
            prefix += num;
            minPrefix = Math.min(minPrefix, prefix);
        }

        if (minPrefix >= 0) return 1;
        return 1 - minPrefix;
    }
}
