package com.algorithm.string;

public class FindSubstring {
    public int find(String src1, String src2, String target1, String target2) {
        int n = target1.length();
        int fast = 0, low = 0, tHelp = 0;
        while (fast < src1.length() && low <= src1.length() - n) {
            while (low <= src1.length() - n &&
                    src1.charAt(low) != target1.charAt(tHelp) &&
                    src2.charAt(low) != target2.charAt(tHelp)) {
                low++;
            }
            if (low > src1.length() - n) {
                break;
            } else {
                fast = low + 1;
                tHelp++;
                while (tHelp < n && fast < src1.length() &&
                        src1.charAt(fast) == target1.charAt(tHelp) &&
                        src2.charAt(fast) == target2.charAt(tHelp)) {
                    fast++;
                    tHelp++;
                }
                if(tHelp == n) return low + 1;
                low = fast;
                tHelp = 0;
            }
        }
        return 0;
    }
}
