import java.util.*;

public class Main {

    public static void main(String[] args) {
        Main test = new Main();
        //q1 test
        Fiction b1 = new Fiction("Frankenstein",0.0, "0000");
        NonFiction b2 = new NonFiction("Anne Frank",0.0,"0000");
        Reference b3 = new Reference("World Maps",0.0,"0000","dictionaries");
        System.out.println(b1.description());
        System.out.println(b2.description());
        System.out.println(b3.description());


        //q2
        Printer p1 ;
        p1 = Printer.getInstance();

        p1.getConnection();



        //q3 test
        int[] nums = {1,3,-1,3,4,-1};
        System.out.println(test.sumAllRepeat(nums));

        //q4 test
        String s = "abcabcbb";
        System.out.println(test.lengthOfLongestSubstring(s));


    }//end of the main




    //q3
    public int sumAllRepeat(int[] nums) {
        if(nums == null ){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i: nums) {
            if(!set.add(i)) {
                res += i;
            }
        }
        return res;
    }


    //q4
    public String lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        String res = "";
        Map<Character, Integer> map = new HashMap<>();//char, index
        int max = 0;
        int left = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (map.containsKey(cur)) {
                left = Math.max(map.get(cur) + 1, left);
            }
            map.put(cur, i);
            int len = i - left + 1;
            if (len > max) {
                res = s.substring(left, i + 1);
                max = len;
            }
        }
        return res;
    }

}//end of the class
