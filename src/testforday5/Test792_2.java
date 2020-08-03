package testforday5;

/**
 * @author wyf
 * @create 2020/7/27
 */
public class Test792_2 {
    public int numMatchingSubseq(String S, String[] words) {
        int sLen = S.length();
        int[][] f = new int[sLen + 1][26];
        int num = 0;
        for (int i = 0; i < 26; i++) {
            f[sLen][i] = sLen;
        }
        for (int i = sLen - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (S.charAt(i) == j + 'a') {
                    f[i][j] = i;
                } else {
                    f[i][j] = f[i + 1][j];
                }
            }
        }
        for (String word : words) {
            int wLen = word.length();
            boolean isSub = true;
            int add = 0;
            for (int i = 0; i < wLen; i++) {
                if (f[add][word.charAt(i) - 'a'] == sLen) {
                    isSub = false;
                    break;
                }
                add = f[add][word.charAt(i) - 'a'] + 1;
            }
            if (isSub) num++;
        }
        return num;
    }
}
