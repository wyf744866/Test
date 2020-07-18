package testforday4;

/**
 * @author wyf
 * @create 2020/7/15
 */
public class Test96_2 {
    public int numTrees(int n) {
        //卡塔兰数
        // 提示：我们在这里需要用 long 类型防止计算过程中的溢出
        long C = 1;
        for (int i = 0; i < n; ++i) {
            C = C * 2 * (2 * i + 1) / (i + 2);
        }
        return (int) C;
    }

}
