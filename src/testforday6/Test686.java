package testforday6;

/**
 * @author wyf
 * @create 2020/8/24
 */
public class Test686 {
    public int repeatedStringMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        String temp = "";
        for (int i = 1; i <= lenB / lenA + 2; i++) {
            temp = temp + A;
            if (temp.indexOf(B) >= 0) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Test686 t = new Test686();
        System.out.println(t.repeatedStringMatch("a", "aa"));
    }
}
