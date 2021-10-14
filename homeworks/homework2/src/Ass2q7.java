public class Ass2q7 {
    public static void main(String[] args) {
        Ass2q7 test = new Ass2q7();
        String num1 = "11";
        String num2 = "123";
        System.out.println(test.addStrings(num1,num2));

        System.out.println(test.addStrings("456","77"));

        System.out.println(test.addStrings("0","0"));

    }


    public String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0) {
            int a = 0, b = 0;
            if(i >= 0) {
                a = num1.charAt(i) - '0';
                i--;
            }
            if(j >= 0) {
                b = num2.charAt(j) - '0';
                j--;
            }

            int cur = a + b + carry;
            if(cur > 9) {
                cur = cur - 10;
                carry = 1;
            } else {
                carry = 0;
            }
            sb.append(cur);
        }

        if(carry > 0) {
            sb.append("1");
        }
        sb.reverse();
        return sb.toString();
    }
}
