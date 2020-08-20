package test.bilibili;

/**
 * @author wyf
 * @create 2020/8/13
 */
public class Test1 {
    boolean result = false;
    public boolean Game24Points (int[] arr) {

        if(arr == null || arr.length == 0) {
            return false;
        }
        f(arr, 1, arr[0]);
        return result;
    }
    public void f(int[] arr, int index,int sum) {
        if(index >= arr.length || result == true) {
            if(sum == 24) {
                result = true;
            }
            return;
        }
        f(arr, index+1, sum + arr[index]);
        f(arr, index+1, sum - arr[index]);
        f(arr, index+1, sum * arr[index]);
        if(arr[index]!= 0) {
            f(arr, index+1, sum / arr[index]);
        }

    }
}
