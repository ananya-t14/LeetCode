class Solution {
    public static String shortestPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (j >= 0) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
            }
            j--;
        }
        
        if (i == s.length()) { // s is already a palindrome
            return s;
        }
        
        String suffix = s.substring(i);
        String prefix = new StringBuilder(suffix).reverse().toString();
        String mid = shortestPalindrome(s.substring(0, i));
        
        return prefix + mid + suffix;        
    }
}