class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
         int zeroCount = 0;

    for(int i =0;i<nums.length;i++){
        if(nums[i] == 0){
            zeroCount++;
            result += zeroCount;
        } else {
            zeroCount = 0;
        }
    }
    return result;
        
    }
}