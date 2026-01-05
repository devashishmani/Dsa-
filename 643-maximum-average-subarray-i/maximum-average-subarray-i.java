class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // पहले k एलिमेंट्स का सम निकालें
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        

        int maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i];        
            currentSum -= nums[i - k];  
            
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return (double) maxSum / k;
    }
}
