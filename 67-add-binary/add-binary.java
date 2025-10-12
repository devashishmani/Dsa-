// class Solution {
//     public String addBinary(String a, String b) {
//         int n1 = Integer.parseInt(a, 2);
//         int n2 = Integer.parseInt(b, 2);
//         int sum = n1 + n2;
//         return Integer.toBinaryString(sum);
//     }
// }
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            sb.append(sum % 2);  // 0 or 1
            carry = sum / 2;     // carry (0 or 1)
        }

        return sb.reverse().toString();
    }
}

