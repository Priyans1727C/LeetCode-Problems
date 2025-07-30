class Solution {
    public boolean isPalindrome(String s) {
        int st = 0;
        int ed = s.length() - 1;

        while (st < ed) {
            char ss = s.charAt(st);
            char e = s.charAt(ed);

            while (st < ed && !Character.isLetterOrDigit(ss)) {
                st++;
                ss = s.charAt(st);
            }

            while (st < ed && !Character.isLetterOrDigit(e)) {
                ed--;
                e = s.charAt(ed);
            }

            if (Character.toLowerCase(ss) != Character.toLowerCase(e)) {
                return false;
            }

            st++;
            ed--;
        }

        return true;
    }

}
