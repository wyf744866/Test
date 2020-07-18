package testforday4;

/**
 * @author wyf
 * @create 2020/7/17
 */
public class Test278 {
    public int firstBadVersion(int n) {
      int left = 0 ,right = n -1;
      while (left <= right){
          int mid = left + ((right - left) >> 1);
          if (isBadVersion(mid)) {
              right = mid - 1;
          } else {
              left = mid + 1;
          }

      }
        return left;
    }

    private boolean isBadVersion(int n) {
        return false;
    }
}
