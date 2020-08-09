package testforday6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyf
 * @create 2020/8/6
 */

public class Test336 {
    //超时
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (isPalindrome(words[i] + words[j])) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    result.add(temp);
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s) {
        int n = s.length() - 1;
        int index = n / 2;
        if (n % 2 == 0) {
            for (int i = index + 1; i <= n; i++) {
                if (s.charAt(i) != s.charAt(--index)){
                    return false;
                }
            }
        }else {
            for (int i = index + 1; i <= n; i++) {
                if (s.charAt(i) != s.charAt(index--)){
                    return false;
                }
            }
        }
        return true;
    }
}
