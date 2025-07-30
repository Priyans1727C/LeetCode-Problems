class Solution {
    static boolean ans;

    void check(String s, int i) {
        if (i >= s.length() / 2) return; 
        if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            ans = false;
            return; 
        }
        check(s, i + 1); 
    }

    public boolean isPalindrome(String s) {
        ans = true;
        StringBuilder cleanBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                cleanBuilder.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        String clean = cleanBuilder.toString();
        check(clean, 0);
        return ans;
    }
}
