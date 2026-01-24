class Solution {
    static int dp[];
    public int rob(int[] nums) {
        int n = nums.length;
        dp= new int [n];
        Arrays.fill(dp,-1);
        return loot(0, nums);

        
    }
    public int loot( int idx , int nums[]){
        if(idx>=nums.length) return 0;
        if(dp[idx]!=-1){
            return dp[idx];

        }
        int steal= nums[idx]+ loot(idx+2, nums);
        int skip= loot(idx+1,nums);
        int ans= Math.max(steal,skip);
        dp[idx]=ans;
        return ans;
    }
}
