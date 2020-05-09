package testforday;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wyf
 * @date 2020/5/6 - 18:00
 */
public class Test983 {
    int[] costs;
    Integer[] memo;
    Set<Integer> dayset;

    public int mincostTickets(int[] days, int[] costs) {
        this.costs = costs;
        memo = new Integer[366];
        dayset = new HashSet();
        for (int d : days) {
            dayset.add(d);
        }
        return dp(1);
    }

    public int dp(int i) {
        if (i > 365) {
            return 0;
        }
        if (memo[i] != null) {
            return memo[i];
        }
        if (dayset.contains(i)) {
            memo[i] = Math.min(Math.min(dp(i + 1) + costs[0], dp(i + 7) + costs[1]), dp(i + 30) + costs[2]);
        } else {
            memo[i] = dp(i + 1);
        }
        return memo[i];
    }

    public static void main(String[] args) {
        Test983 t = new Test983();
        int[] days ={1,2,3,4,5,6,8,20,40};
        int[] costs = {2,7,14};
        System.out.println(t.mincostTickets(days,costs));
    }
}
