package testforday4;

import java.util.List;

/**
 * @author wyf
 * @create 2020/7/14
 */
public class Test120 {
    //递归
    //超时
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() <=0) return 0;
        int m = triangle.size();
        return triangle.get(0).get(0)+subTotal(triangle,1,0,m);
    }

    private int subTotal(List<List<Integer>> triangle, int layer,int next,int size) {
        if (layer >= size) return 0;
        int left = triangle.get(layer).get(next)+subTotal(triangle,layer+1,next,size);
        int right = triangle.get(layer).get(next+1)+subTotal(triangle,layer+1,next+1,size);
        return Math.min(left,right);
    }
}
