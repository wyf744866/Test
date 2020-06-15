package testforday2;

/**
 * @author wyf
 * @create 2020/6/10
 */
public class Test9_2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String num = String.valueOf(x);
        int len = num.length();
        for (int i = 0; i < len/2; i++) {
            if (num.charAt(i) != num.charAt(len-1-i))
                return false;
        }
        return true;
    }
}
