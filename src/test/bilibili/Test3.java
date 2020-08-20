package test.bilibili;

/**
 * @author wyf
 * @create 2020/8/13
 */
public class Test3 {
    public int GetCoinCount(int N) {
        if (N >= 1024) return 0;
        int money = 1024 - N;
        int a = money / 64;
        int b = (money - a * 64) / 16;
        int c = (money - a * 64 - b * 16) / 4;
        int d = money - a * 64 - b * 16 - c * 4;
        // write code here
        return a + b + c + d;
    }
}
