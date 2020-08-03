package testforday5;

/**
 * @author wyf
 * @create 2020/7/27
 */
public class Test392 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || s.length() <= 0) return true;
        if (t == null|| t.length() <= 0) return false;
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(index)){
                index++;
                if (index >= s.length()) return true;
            }
        }

        return false;
    }
/*
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
*/



    public static void main(String[] args) {
        Test392 t = new Test392();
        System.out.println(t.isSubsequence("abc", "ahbgdc"));
    }
}
