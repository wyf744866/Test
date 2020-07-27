package test;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/7/22
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        while (in.hasNextLine()) {
            String tString = in.next();
            int num = in.nextInt();
            //  System.out.println("请输入一个字符串");
            //   String str = in.nextLine();
            System.out.println("num:" + num);
            String str = in.next();
            System.out.println("num=" + num + ",str=" + str);
            String s3 = in.nextLine();
            System.out.println("s3:" + s3);
        }
    }

}
