package testforday4;

/**
 * @author wyf
 * @create 2020/7/18
 */
public class Test97_4 {
    //记忆回溯
    class Solution {
        public boolean isInterleave(String s1, String s2, String s3) {
            if(s1 == null) s1 = "";
            if(s2 == null) s2 = "";
            if(s3 == null) s3 = "";
            return helper(s1, s2, s3, 0, 0, 0,
                    new Boolean[s1.length()+1][s2.length()+1]);
        }

        public boolean helper(String s1, String s2, String s3, int i, int j, int k, Boolean[][] memo){
            // 若当前memo[i][j]不为空，则直接返回
            if(memo[i][j] != null)
                return memo[i][j];
            if(i == s1.length() && j == s2.length() && k == s3.length())
                return true;

            // 记录
            if(k >= s3.length())
                return memo[i][j] = false;

            if(s1.length() > i){
                if(s1.charAt(i) == s3.charAt(k) &&
                        helper(s1, s2, s3, i+1, j, k+1, memo))
                    return true;
            }

            if(j < s2.length()){
                if(s2.charAt(j) == s3.charAt(k) &&
                        helper(s1, s2, s3, i, j+1, k+1, memo))
                    return true;
            }

            // 记录
            return memo[i][j] = false;
        }
    }


}
