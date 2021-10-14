public class Ass2q9 {
    public static void main(String[] args) {
        Ass2q9 test = new Ass2q9();
        System.out.println(test.reverseWords("the sky is blue"));
        System.out.println(test.reverseWords(" hello world"));
        System.out.println(test.reverseWords("a good example"));
        System.out.println(test.reverseWords(" Bob Loves Alice"));
        System.out.println(test.reverseWords("Alice does not even like bob"));

    }


    public String reverseWords(String s) {
        if(s == null || s.length() < 1){
            return s;
        }

        char[] carr = s.trim().toCharArray();
        removeSpace(carr);
        reverse(carr, 0, carr.length -1);

        int i = 0;
        while(i < carr.length){
            if(carr[i] == ' '){
                i++;
                continue;
            }
            int start = i;
            while(i < carr.length && carr[i] != ' '){
                i++;
            }
            reverse(carr, start, i - 1);
        }

        String str = String.valueOf(carr);
        return str.trim();
    }

    private void removeSpace(char[] carr){
        int slow = 0;

        for(int i = 0; i < carr.length; i++){
            if(carr[i] == ' ' &&  carr[i - 1] == ' '){
                continue;
            }else
                carr[slow++] = carr[i];
        }

        for(;slow < carr.length; slow++){
            carr[slow] = ' ';
        }
    }

    private void reverse(char[] s, int start, int end) {
        if(s == null || s.length < 2){
            return;
        }
        int left = start;
        int right = end;
        while( left < right){
            swap(s, left++, right--);
        }
    }

    private void swap(char[] s, int a, int b){
        char t = s[a];
        s[a] = s[b];
        s[b] = t;
    }

}
