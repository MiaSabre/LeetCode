/**
 * Created by Mia on 6/15/17.
 */
class StrString {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
   /* public static void main(String[] args) {

        String source = "abcdefgh";
        String target = "cde";
        StrString s = new StrString();
        System.out.println(s.strStr(source, target));
    }*/

    public static int strStr(String source, String target) {
        if (source == null || target == null) {
            return -1;
        }

        for (int i = 0; i < source.length() - target.length() + 1; i++) {
            int j = 0;
            for (j = 0; j < target.length(); j++) {
                if (source.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }
            // finished loop, target found
            if (j == target.length()) {
                return i;
            }
        }
        return -1;
    }
}



    /*For a given source string and a target string, you should output the first index(from 0) of target string in source string.

       If target does not exist in source, just return -1.


        Clarification
        Do I need to implement KMP Algorithm in a real interview?

        Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
        Example
        If source = "source" and target = "target", return -1.

        If source = "abcdabcdefg" and target = "bcd", return 1.

        Challenge
        O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)*/