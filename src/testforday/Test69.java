package testforday;

/**
 * @author wyf
 * @date 2020/5/9 - 13:05
 */
public class Test69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return  0;
        }
           return (int) Math.pow((double) x,0.5);
    }

    public static void main(String[] args) {
        Test69 test69 = new Test69();
        System.out.println(test69.mySqrt(8));
    }
}
