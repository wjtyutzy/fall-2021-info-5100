public class Ass2q8 {

    public static void main(String[] args) {
        Ass2q8 test = new Ass2q8();
        System.out.println(test.isPalindrome("A man,a plan,a canal:Panama"));
        System.out.println(test.isPalindrome("race a car"));

    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while(i < j) {
            if(!isCharOrDig(s.charAt(i))) {
                i++;
                continue;
            }
            if(!isCharOrDig(s.charAt(j)))  {
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isCharOrDig(char c) {
        return (c >= 'a' && c <= 'z' )||(c >= 'A' && c <= 'Z' ) || (c >= '0' && c <= '9');
    }
}
