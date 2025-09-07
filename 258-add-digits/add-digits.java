class Solution {
    public int addDigits(int num) {
        // Base case: if num is a single digit
        if (num < 10) return num;

        // First compute sum of digits
        int sum = (num % 10) + addDigits(num / 10);

        // If sum has more than 1 digit, call recursively again
        return addDigits(sum);
    }
}
