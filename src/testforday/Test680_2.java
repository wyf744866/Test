package testforday;

/**
 * @author wyf
 * @date 2020/5/19 - 16:11
 */
public class Test680_2 {
    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i+(j-i)/2; k++) {
            if (s.charAt(k) != s.charAt(j+i-k)){
                return false;
            }
        }
        return  true;
    }
    public boolean validPalindrome(String s){
        int i = 0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else {
                return isPalindromeRange(s,i+1,j)||isPalindromeRange(s,i,j-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test680_2 t = new Test680_2();
        System.out.println(t.validPalindrome("adca"));
    }
}
