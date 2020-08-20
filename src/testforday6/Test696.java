package testforday6;

/**
 * @author wyf
 * @create 2020/8/10
 */
public class Test696 {
    public int countBinarySubstrings(String s) {
        int len = s.length();
        int times = 0, index1 = 0, index2 = 0,i = 0;
        while (i < len){
            if (s.charAt(i) == '0') {
                index1 = i;
                int num1 = 0, num2 = 0;
                while (index1 < len && s.charAt(index1) == '0') {
                    num1++;
                    index1++;
                }
                index2 = index1;
                while (index2 < len && s.charAt(index2) == '1') {
                    num2++;
                    index2++;
                }
                times += Math.min(num1,num2);
                i = index1;
            } else {
                index2 = i;
                int num1 = 0, num2 = 0;
                while (index2 < len && s.charAt(index2) == '1') {
                    num2++;
                    index2++;
                }
                index1 = index2;
                while (index1 < len && s.charAt(index1) == '0') {
                    num1++;
                    index1++;
                }
                times += Math.min(num1,num2);
                i = index2;
            }
        }

        return times;
    }

    public static void main(String[] args) {
        Test696 t = new Test696();
        System.out.println(t.countBinarySubstrings("10101"));
    }

}
