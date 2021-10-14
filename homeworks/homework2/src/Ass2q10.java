public class Ass2q10 {
    public static void main(String[] args) {
        Ass2q10 test = new Ass2q10();
        char[] chars1 = "aabbcc".toCharArray();
        System.out.println(test.compress(chars1));

        char[] chars2 = {'a'} ;
        System.out.println(test.compress(chars2));

        char[] chars3 = "abbbbbbbbbb".toCharArray();
        System.out.println(test.compress(chars3));

        char[] chars4 = "aaabbaa".toCharArray();
        System.out.println(test.compress(chars4));


    }



    public int compress(char[] chars) {

        if(chars.length < 2) {
            return chars.length;
        }
        int i = 0;
        int count = 0;
        int last = 0;
        while(i < chars.length) {
            int st = i;
            while(i < chars.length && chars[i] == chars[st]) {
                i++;
            }
            int length = i - st;
            //head char
            chars[last++] = chars[st];

            if(length >= 2) {
                // int to string
                char[] carr = String.valueOf(length).toCharArray();

                for(char c : carr) {
                    chars[last++] = c;
                }
            }
        }

        return last;
    }
}
