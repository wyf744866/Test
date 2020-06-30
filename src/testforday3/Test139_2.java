package testforday3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wyf
 * @create 2020/6/25
 */
public class Test139_2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        //这个出错
        Test139_2 t = new Test139_2();
        String[] aa = {"aaaa","aaa"};
        List<String> strings= Arrays.asList(aa);
        System.out.println(t.wordBreak("aaaaaaa", strings));
    }
}
