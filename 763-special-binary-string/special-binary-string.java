import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials = new ArrayList<>();
        int count = 0, start = 0;

     
        for (int i = 0; i < s.length(); i++) {
            count += (s.charAt(i) == '1') ? 1 : -1;

            
            if (count == 0) {

                String inner = makeLargestSpecial(s.substring(start + 1, i));
                specials.add("1" + inner + "0");
                start = i + 1;
            }
        }

        // Step 2: Sort substrings in descending order
        Collections.sort(specials, Collections.reverseOrder());

       
        StringBuilder result = new StringBuilder();
        for (String str : specials) {
            result.append(str);
        }

        return result.toString();
    }
}
