class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(Character.toLowerCase(ch));
            }
        }
        String Str = result.toString();
        return P(Str, 0, Str.length() - 1);
    }

    // Recursive helper function to check palindrome
    private boolean P(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return P(s, left + 1, right - 1);
    }
}