class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        int maxWithoutDeletion = arr[0];  
        int maxWithOneDeletion = 0;       
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            maxWithOneDeletion = Math.max(maxWithoutDeletion, maxWithOneDeletion + arr[i]);
            maxWithoutDeletion = Math.max(arr[i], maxWithoutDeletion + arr[i]);
            ans = Math.max(ans, Math.max(maxWithoutDeletion, maxWithOneDeletion));
        }

        return ans;
    }
}
