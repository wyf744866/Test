package testforday2;

/**
 * @author wyf
 * @create 2020/6/10
 */
public class Test9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int xDigit = 0,a = x;
        while (a != 0) {
            a = a/10;
            xDigit++;
        }
        long div = 1, mod = 10, newNum = 0,newDigit = xDigit-1;
        for (int i = 0; i < xDigit; i++,mod*=10,div*=10) {
            int digit = (int) Math.pow(10,newDigit--);
               newNum+= ((x % mod)/div)*digit;  //mod可能超出范围
        }
        return newNum == x;
    }

    public static void main(String[] args) {
        Test9 t = new Test9();

        System.out.println(t.isPalindrome(1410110141));
//        System.out.println(Math.exp(3));
    }
}
