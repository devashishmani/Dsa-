import java.util.*;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        ArrayList<Integer> result = new ArrayList<>();

  
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                result.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                result.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                result.add(nums[i]);
            }
        }

       
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
