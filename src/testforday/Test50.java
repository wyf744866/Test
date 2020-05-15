package testforday;

/**
 * @author wyf
 * @date 2020/5/11 - 12:34
 */
public class Test50 {
    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }

    public static void main(String[] args) {
        Test50 t = new Test50();
        System.out.println(t.myPow(2.1, 3));
    }
}
