package testforday3;

/**
 * @author wyf
 * @create 2020/6/23
 */
public class Test67_2 {
    public String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
        );
    }

    public static void main(String[] args) {
        System.out.println(Integer.valueOf("-110"));
    }
}
