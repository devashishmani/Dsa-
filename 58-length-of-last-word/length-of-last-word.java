public class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        int i = ch.length - 1;
        int length = 0;

       
        while (i >= 0 && ch[i] == ' ') {
            i--;
        }

     
        while (i >= 0 && ch[i] != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
