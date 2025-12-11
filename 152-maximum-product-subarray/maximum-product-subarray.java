class Solution {
    public int maxProduct(int[] arr) {

        int maxProd = arr[0];
        int minProd = arr[0]; 
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int tempMax = Math.max(arr[i], Math.max(maxProd * arr[i], minProd * arr[i]));
            int tempMin = Math.min(arr[i], Math.min(maxProd * arr[i], minProd * arr[i]));

            maxProd = tempMax;
            minProd = tempMin;

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}
