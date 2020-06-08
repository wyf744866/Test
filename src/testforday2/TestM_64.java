package testforday2;

/**
 * @author wyf
 * @create 2020/6/2
 */
public class TestM_64 {
    public int sumNums(int n) {
        boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public static void main(String[] args) {
        TestM_64 t = new TestM_64();
        System.out.println(t.sumNums(9));
    }
}
