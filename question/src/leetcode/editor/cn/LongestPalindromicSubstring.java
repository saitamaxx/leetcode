package leetcode.editor.cn;

import java.util.Objects;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new LongestPalindromicSubstring().new Solution();
    }

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    public String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && Objects.equals(s.charAt(l), s.charAt(r))) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}