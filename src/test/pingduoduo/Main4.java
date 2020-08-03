package test.pingduoduo;

import java.util.Scanner;

/**
 * @author wyf
 * @create 2020/8/2
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] land = new String[6];
        for (int i = 0; i < 6; i++) {
            land[i] = sc.nextLine();
        }
        System.out.println(plantNum(land));
    }

    private static int plantNum(String[] land) {
        char[][] charLand = new char[6][];
        for (int i = 0; i < 6; i++) {
            charLand[i] = land[i].toCharArray();
        }
        int num = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (charLand[i][j] == '#') {
                    num *= typeNums(charLand, i, j,6);
                }
            }
        }

        return num;
    }

    private static int typeNums(char[][] charLand, int i, int j,int types) {
        int[] a = {1,-1,0,0};
        int[] b = {0,0,-1,1};
        int num = types;
        charLand[i][j] = '*';
        int c = types;
        for (int k = 0; k < 4; k++) {
            int in = i + a[k];
            int jn = j + b[k];
            if(in < 6 && in >= 0 && jn < 6 && jn >=0 && charLand[in][jn] == '#'){
                num *=  (typeNums(charLand,in,jn,5));
                c--;
            }
        }
        return num;
    }
}
