package testforday3;

/**
 * @author wyf
 * @create 2020/6/19
 */
public class Test125 {
    public boolean isPalindrome(String s) {
        StringBuffer newStr = new StringBuffer();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)){
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }

    public static void main(String[] args) {
        Test125 t = new Test125();
        System.out.println(t.isPalindrome("race a car"));
    }
}
