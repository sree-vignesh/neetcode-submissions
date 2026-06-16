public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int index = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            if (isSame(strs, i)) {
                index++;
            } else {
                break;
            }
        }
        return strs[0].substring(0, index);
    }

    public static boolean isSame(String[] strs, int index) {
        for (String x : strs) {
            if (x.length() <= index) {
                return false;
            }
        }
        char chr = strs[0].charAt(index);

        for (String x : strs) {
            if (x.charAt(index) != chr) {
                return false;
            }
        }

        return true;
    }
}
