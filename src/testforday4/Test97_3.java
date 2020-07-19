package testforday4;

/**
 * @author wyf
 * @create 2020/7/18
 */
public class Test97_3 {
    class Solution {
        //暴力回溯法
        public boolean isInterleave(String s1, String s2, String s3) {
            // 题目没有明确说明s123是否为null，需要判null，这里直接令其等于空字符
            // 若s1为空，即不会参数空指针异常也不会参与到计算当中
            if(s1 == null) s1 = "";
            if(s2 == null) s2 = "";
            if(s3 == null) s3 = "";
            return helper(s1, s2, s3, 0, 0, 0);
        }

        public boolean helper(String s1, String s2, String s3, int i, int j, int k){
            // 若回溯用完了s1,s2,s3，说明能够s3能够被交替组成
            if(i == s1.length() && j == s2.length() && k == s3.length())
                return true;

            if(k >= s3.length())
                return false;

            if(i < s1.length()){
                // 若当前s1的i位置的字符与s3的k位置字符相等，则消耗一个字符，
                // 并向下回溯，若回溯返回true则返回的这个true最开始一定
                // 是由该函数内第二行代码返回的，即表示s3能够被交替组成，直接返回true
                if(s1.charAt(i) == s3.charAt(k) &&
                        helper(s1, s2, s3, i+1, j, k+1))
                    return true;
            }

            if(j < s2.length()){
                if(s2.charAt(j) == s3.charAt(k) &&
                        helper(s1, s2, s3, i, j+1, k+1))
                    return true;
            }

            // 在此i、j、k下，无论如何都不能组成s3.substring(0, k+1),返回false
            return false;
        }
    }

}
