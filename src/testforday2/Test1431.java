package testforday2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wyf
 * @create 2020/6/1
 */
public class Test1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int maxCandies = 0;
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= maxCandies){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
}
