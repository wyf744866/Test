package testforday6;

/**
 * @author wyf
 * @create 2020/8/3
 */
public class Test415 {
    public String addStrings(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        char[] add = new char[Math.max(n, m)];
        int carry = 0;
        for (int i = 0; i < Math.max(n, m); i++) {
            int num = 0;
            if (i < n && i < m) {
                num = (num2.charAt(m-1-i) - '0') + (num1.charAt(n-1-i) - '0') + carry;
            } else if (i >= n && n != m) {
                num = (num2.charAt(m-1-i) - '0') + carry;
            } else {
                num = (num1.charAt(n-1-i) - '0') + carry;
            }
            carry = num / 10;
            int temp = num % 10 + '0';
            add[i] = (char) temp;
        }
        StringBuffer result = new StringBuffer();
        if (carry > 0){
            result.append(1);

        }
        for (int i = add.length - 1; i >= 0; i--) {
            result.append(add[i]);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Test415 t = new Test415();
        System.out.println(t.addStrings("9", "99"));

    }
}
