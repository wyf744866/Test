package testforday7;

/**
 * @author wyf
 * @create 2020/8/29
 */
public class Test214 {
    //超时
    public String shortestPalindrome(String s) {
        StringBuilder newS = new StringBuilder(s);
        int len = s.length();
        int index = 0;
        if (isPalindrome(s)){
            return s;
        }else {
            while (len > 0){
                newS.insert(index,s.charAt(len-1));
                if (isPalindrome(newS.toString())){
                    break;
                }else {
                    index++;
                    len--;
                }
            }
        }

        return newS.toString();
    }

    private boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test214 t = new Test214();
        System.out.println(t.shortestPalindrome("abcd"));
    }
}
