class Solution {
    public boolean detectCapitalUse(String word) {
        int upperCount = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                upperCount++;
            }
        }

       
        if (upperCount == word.length()) return true;

        
        if (upperCount == 0) return true;

      
        if (upperCount == 1 && Character.isUpperCase(word.charAt(0))) return true;

        return false;
    }
}
