package testforday6;

/**
 * @author wyf
 * @create 2020/8/13
 */
public class Test43_3 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        String num = "";
        int level = 1;
        for (int i = len1 - 1; i >= 0; i--, level *= 10) {
            int temp = 0;
            int a = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int b = num2.charAt(j) - '0';
                temp = a * b;
            }
            num = stringAdd(num, String.valueOf(temp));
        }

        return num;
    }

    private String stringAdd(String num1, String num2) {
        StringBuffer res = new StringBuffer();
        int carry = 0;
        for (int i = num1.length(), j = num2.length(); i >= 0 || j >= 0 || carry > 0; i--, j++) {
            int a = i < 0 ? 0 : num1.charAt(i) - '0';
            int b = j < 0 ? 0 : num2.charAt(j) - '0';
            int num = a + b + carry;
            carry = num / 10;
            res.append(num % 10);

        }
        return res.reverse().toString();
    }
}
