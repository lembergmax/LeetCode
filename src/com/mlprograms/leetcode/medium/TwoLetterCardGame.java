package com.mlprograms.leetcode.medium;

// https://leetcode.com/problems/two-letter-card-game/description/
public class TwoLetterCardGame {

    public static int score(String[] cards, char x) {
        int pairs = 0;
        int lc[] = new int[10];
        int rc[] = new int[10];

        for (String s : cards) {
            boolean hl = (s.charAt(0) == x), hr = (s.charAt(1) == x);
            if (!hl && !hr)
                continue;
            if (hl && hr)
                pairs++;
            else if (hl)
                rc[s.charAt(1) - 'a']++;
            else
                lc[s.charAt(0) - 'a']++;
        }

        int suml = 0, bl = 0, sumr = 0, br = 0;
        for (int i = 0; i < 10; i++) {
            suml += lc[i];
            bl = Math.max(bl, lc[i]);
            sumr += rc[i];
            br = Math.max(br, rc[i]);
        }

        int ans = Math.min(
                Math.min(suml / 2, suml - bl) + Math.min(sumr / 2, sumr - br),
                (suml + sumr - Math.min(pairs, suml + sumr)) / 2
        );

        return Math.min(pairs, suml + sumr) + ans;
    }

    public static void main(String[] args) {
        System.out.println(score(new String[]{"aa", "ab", "ba", "ac"}, 'a'));       // 2
        System.out.println(score(new String[]{"aa", "ab", "ba"}, 'a'));             // 1
        System.out.println(score(new String[]{"aa", "ab", "ba", "ac"}, 'b'));       // 0
        System.out.println(score(new String[]{"ab", "bb"}, 'b'));                   // 1
        System.out.println(score(new String[]{"aa", "ab", "ba", "ac"}, 'a'));       // 2
        System.out.println(score(new String[]{"ba","ba"}, 'b'));                    // 0
        System.out.println(score(new String[]{"ab","aa","ab","bc","cc","bc","bb","ac","bc","bc","aa","aa","ba","bc","cb","ba","ac","bb","cb","ac","cb","cb","ba","bc","ca","ba","bb","cc","cc","ca","ab","bb","bc","ba","ac","bc","ac","ac","bc","bb","bc","ac","bc","aa","ba","cc","ac","bb","ba","bb"}, 'b'));                    // 16
    }

}
