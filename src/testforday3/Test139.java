package testforday3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wyf
 * @create 2020/6/25
 */
public class Test139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        int i = 0, j = 0;
        while (i < len) {
            String temp = s.substring(i,j);
            while (!wordDict.contains(temp) && j < len){
                j++;
                temp = s.substring(i,j);
            }
            if (!wordDict.contains(temp)){
                return false;
            }
            i = j;
        }

        return true;
    }

    public static void main(String[] args) {
        //这个出错
        Test139 t = new Test139();
        String[] aa = {"aaaa","aaa"};
        List<String> strings= Arrays.asList(aa);
        System.out.println(t.wordBreak("aaaaaaa", strings));
    }
}
