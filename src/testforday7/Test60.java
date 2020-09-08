package testforday7;

/**
 * @author wyf
 * @create 2020/9/5
 */
public class Test60 {
    public String getPermutation(int n, int k) {
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            s.append(i);
        }
        return  getString(s.toString(), k);
    }

    private String getString(String s, int k) {
        int n = s.length();
        if (n <= 1 || k == 1) return s;
        StringBuilder sb = new StringBuilder(s);
        int num = factoryNum(n-1);
        int index = (k-1) / num;
        if (index > 0) {
            char s1 = sb.charAt(index);
            sb.delete(index , index + 1);
            sb.insert(0,s1);
            return s1 + getString(sb.substring(1,n),k-(num*index));
        }else {
           return sb.charAt(0)+getString(sb.substring(1, n), k);
        }

    }

    private int factoryNum(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Test60 t = new Test60();
        System.out.println(t.getPermutation(4, 9));
    }

}
