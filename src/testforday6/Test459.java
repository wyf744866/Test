package testforday6;

/**
 * @author wyf
 * @create 2020/8/24
 */
public class Test459 {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i * 2 <= len; i++) {
            if (len % i == 0) {
                boolean match = true;
                for (int j = i; j < len; j++) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                        break;
                    }
                }
                if (match){
                    return  true;
                }
            }

        }
        return false;
    }
    public boolean repeatedSubstringPattern1(String s) {
      /*  int indexOf(String str, int fromIndex): 返回从 fromIndex
        位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1*/
        return (s + s).indexOf(s, 1) != s.length();
    }

    public static void main(String[] args) {
        Test459 t = new Test459();
        System.out.println(t.repeatedSubstringPattern("aabb"));
    }


}
