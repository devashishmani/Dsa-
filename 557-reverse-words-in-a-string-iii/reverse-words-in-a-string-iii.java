class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int j = i;
            while (j < n && arr[j] != ' ') {
                j++;
            }
        
            reverse(arr, i, j - 1);

            i = j + 1;
        }

        return new String(arr);
    }

    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
