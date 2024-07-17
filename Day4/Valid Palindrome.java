class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else
                return (Palindrome(left+1, right, s) || Palindrome(left, right-1, s));
        }
        return true;

    }

    public boolean Palindrome(int l, int r, String s) {
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;

    }
}
