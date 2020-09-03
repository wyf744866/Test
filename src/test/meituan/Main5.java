package test.meituan;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/29
 */
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String originS = sc.nextLine();
        System.out.println(decodeStr(originS));
    }

    private static String decodeStr(String originS) {
        int start = 0,end = 0;
        boolean flag = true;
        for (int i = 0; i < originS.length(); i++) {
            if (flag == true &&originS.charAt(i) == 'T'){
                flag = false;
                start = i;
            }
            if (originS.charAt(i) == 'M'){
                end = i;
            }
        }
        return originS.substring(start+1,end);
    }
}
