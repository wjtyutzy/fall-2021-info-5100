package ass01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringsAndArrays {
    public static void main(String args[]) {
        StringsAndArrays t =new StringsAndArrays();

        //q1
        int[] num1 = {1, 2, 3, 2};
        int[] num2 = {1, 1, 1, 1, 1};
        int[] num3 = {1, 2, 3, 4, 5};
        System.out.println(t.getUniqueSum(num1));
        System.out.println(t.getUniqueSum(num2));
        System.out.println(t.getUniqueSum(num3));
        System.out.println("===================================");

        //q2
        int[] q2n1 = {-4, -1, 0, 3, 10};
        int[] q2n2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(t.arraySquare(q2n1)));
        System.out.println(Arrays.toString(t.arraySquare(q2n2)));
        System.out.println("===================================");

        //q3
        int[] q3t1 = {2, 3, 4, 2, 2, 3, 5, 7};
        int[] q3t2 = {0, 0, 1, 1};
        System.out.println(t.getFirstUnique(q3t1));
        System.out.println(t.getFirstUnique(q3t2));
        System.out.println("===================================");

        //q4
        String q4s1 = "a";
        String q4s11 = "b";
        String q4s2 = "aa";
        String q4s21 = "ab";
        String q4s3 = "aabb";
        String q4s31 = "cbavvbnba";
        System.out.println(t.canConstruct(q4s1, q4s11));
        System.out.println(t.canConstruct(q4s2, q4s21));
        System.out.println(t.canConstruct(q4s3, q4s31));
        System.out.println("===================================");

        //q5
        String q5t1 = "1A3d4s5t";
        String q5t2 = "A2bb2d4";
        System.out.println(t.isDigiCharSeq(q5t1));
        System.out.println(t.isDigiCharSeq(q5t2));

    }

    //Question 1:

    public int getUniqueSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int sum = 0;
        while (i < nums.length) {
            int tmp = nums[i];
            int j = i;
            while (j < nums.length && nums[j] == tmp) {
                j++;
            }

            if (j == i + 1) {
                sum += tmp;
            }
            i = j;
        }
        return sum;
    }


    //Question 2:

    public int[] arraySquare(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] * nums[i];
        }
        Arrays.sort(res);
        return res;
    }


    //Question 3:

    public int getFirstUnique(int[] nums) {
        int[] copyArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyArr);

        int i = 0;
        Set<Integer> set = new HashSet<>();
        while (i < copyArr.length) {
            int tmp = copyArr[i];
            int j = i;
            while (j < copyArr.length && copyArr[j] == tmp) {
                j++;
            }

            if (j == i + 1) {
                set.add(copyArr[i]);
            }
            i = j;
        }

        for (int n : nums) {
            if (set.contains(n)) {
                return n;
            }
        }

        return -1;
    }


    //Question 4:

    public boolean canConstruct(String ran, String maz) {
        //freq map........ better way? sort? if sort and then two pointer?
        char[] ranArr = ran.toCharArray();
        char[] mazArr = maz.toCharArray();
        Arrays.sort(ranArr);
        Arrays.sort(mazArr);

        int i = 0, j = 0;
        while (i < ranArr.length && j < mazArr.length) {
            if (ranArr[i] == mazArr[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == ranArr.length;
    }


    //Question 5:

    public boolean isDigiCharSeq(String str) {
        if (str.length() <= 1) {
            return true;
        }

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (isDig(c)) {
                if (!isChar(prev)) {
                    return false;
                }
            } else {
                if (!isDig(prev)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isDig(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isChar(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

}
