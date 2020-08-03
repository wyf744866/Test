package testforday6;

/**
 * @author wyf
 * @create 2020/7/30
 */
public class Test343 {
    public int integerBreak(int n) {
        int [] maxMultii = new int[n+1];
        maxMultii[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                maxMultii[i] = Math.max(Math.max(maxMultii[i],j*maxMultii[i-j]),j*(i-j));
            }
        }

        return maxMultii[n];
    }

    public static void main(String[] args) {
        Test343 t = new Test343();
        System.out.println(t.integerBreak(10));
    }
}
