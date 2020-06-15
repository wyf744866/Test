package testforday2;

/**
 * @author wyf
 * @create 2020/6/13
 */
public class Test70 {
    public int climbStairs(int n) {
        int preStairs = 0;
        int nStairs = 1;
        for (int i = 1; i <= n; i++) {
            int nextStairs = nStairs + preStairs;
            preStairs = nStairs;
            nStairs = nextStairs;
        }
        return nStairs;
    }

    public static void main(String[] args) {
        Test70 t = new Test70();
        System.out.println(t.climbStairs(3));
    }
}
