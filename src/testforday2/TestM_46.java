package testforday2;

/**
 * @author wyf
 * @create 2020/6/9
 */
public class TestM_46 {
    public int translateNum(int num) {
        String str = String.valueOf(num);
        int length = str.length();
        int[] nStrNum = new int[length];
        nStrNum[0] = 1;
        for (int i = 1; i < length; i++) {
            int anInt = Integer.parseInt(str.substring(i - 1, i + 1));
            if (anInt <= 25 && anInt >=10) {
                if (i > 1) {
                    nStrNum[i] = nStrNum[i - 1] + nStrNum[i - 2];
                }else {
                    nStrNum[i] = nStrNum[i - 1] + 1;
                }

            } else {
                nStrNum[i] = nStrNum[i - 1];
            }
        }

        return nStrNum[length -1];
    }
}
