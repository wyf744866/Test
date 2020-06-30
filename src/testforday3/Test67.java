package testforday3;

/**
 * @author wyf
 * @create 2020/6/23
 */
public class Test67 {
    public String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        StringBuilder c = new StringBuilder();
        int i = len1 - 1, j = len2 - 1, carry = 0, temp = 0;
        while (i >= 0 || j >= 0) {
            if (i < 0) {
                temp = b.charAt(j--) + carry-'0' ;
                carry = temp / 2;
                c.append(temp % 2);
            } else if (j < 0) {
                temp = a.charAt(i--) + carry -'0';
                carry = temp / 2;
                c.append(temp % 2);
            } else {
                temp = a.charAt(i--) + b.charAt(j--) + carry-'0'-'0';
                carry = temp / 2;
                c.append(temp % 2);
            }
        }
        if (carry > 0) {
            c.append(1);
        }

        return String.valueOf(c.reverse());
    }

    public static void main(String[] args) {
        Test67 t = new Test67();
        System.out.println(t.addBinary("0", "0"));
    }
}
