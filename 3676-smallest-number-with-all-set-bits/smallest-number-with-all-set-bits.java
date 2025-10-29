class Solution {
    public int smallestNumber(int n) {
        // find the number of bits required
        int bits = Integer.SIZE - Integer.numberOfLeadingZeros(n);
        // (1 << bits) gives 2^bits; subtract 1 gives all ones
        int result = (1 << bits) - 1;
        // If result < n (rare if n is exactly power of two), need next
        if (result < n) {
            result = (1 << (bits + 1)) - 1;
        }
        return result;
    }
}
