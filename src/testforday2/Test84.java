package testforday2;

/**
 * @author wyf
 * @create 2020/5/30
 */
public class Test84 {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length <= 0) {
            return 0;
        }

        int maxArea = heights[0];
        for (int i = 1; i < heights.length; i++) {
               maxArea = Math.max(maxArea,includeMax(heights,i));
        }

        return maxArea;
    }

    private int includeMax(int[] heights, int i) {
        int nArea = heights[i];
        int min=heights[i];
/*      有问题
  for (int j = i-1; j > 0; j--) {
            if (heights[j] < heights[i] && heights[j] < heights[next]){
                next--;
                nArea = Math.max(nArea,heights[j]*(i-j+1));
            }else if (heights[j] < heights[i] && heights[j] >= heights[next]){
                next--;
                nArea = Math.max(nArea,heights[next]*(i-j+1));
            }else {
                next--;
                nArea = Math.max(nArea,heights[i]*(i-j+1));
            }
        }*/
        for (int j = i-1; j >= 0; j--){
            if (heights[j] < min){
                min = heights[j];
            }
            nArea = Math.max(nArea,min*(i-j+1));
        }
        return nArea;
    }

    public static void main(String[] args) {
        Test84 t = new Test84();
        int[] nums ={1,1};
        System.out.println(t.largestRectangleArea(nums));
    }
}
