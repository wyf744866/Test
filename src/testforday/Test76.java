package testforday;

/**
 * @author wyf
 * @create 2020/5/23
 */
public class Test76 {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen == 0 || tLen == 0 || sLen < tLen)
            return "";
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        //ascii('z') = 122
        int[] winFreq = new int[128];
        int[] tFreq = new int[128];
        for (char c : charsT) {
            tFreq[c]++;
        }

        int distance = 0;
        int minLen = sLen + 1;
        int begin = 0;

        int left = 0;
        int right = 0;
        //[left right)
        while (right< sLen){
            char charRight = charsS[right];
            if (tFreq[charRight] == 0){
                right++;
                continue;
            }
            if (winFreq[charRight] < tFreq[charRight]){
                distance++;
            }
            winFreq[charRight]++;
            right++;
             while (distance == tLen){
                 if (right - left < minLen){
                     minLen = right -left;
                     begin = left;
                 }

                 char charLeft = charsS[left];
                 if (tFreq[charLeft] == 0){
                     left++;
                     continue;
                 }

                 if (winFreq[charLeft] == tFreq[charLeft]){
                     distance--;
                 }
                 winFreq[charLeft]--;
                 left++;
             }
        }
        if (minLen == sLen + 1) return "";
        return s.substring(begin,begin + minLen);
    }
}
