package testforday5;

/**
 * @author wyf
 * @create 2020/7/27
 */
public class Test792 {
    public int numMatchingSubseq(String S, String[] words) {
        int n = S.length();
        int num = 0;
        for (String word : words) {
            int len = word.length();
            int i = 0, j = 0;
            while (i < n && j < len) {
                if (S.charAt(i) == word.charAt(j)) {

                    j++;
                }
                i++;
            }
            if (j == len) num++;
        }
        return num;
    }
}
