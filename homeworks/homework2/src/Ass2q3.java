import java.util.Arrays;

public class Ass2q3 {

    public static void main(String[] args){
        Ass2q3 test = new Ass2q3();
        int[] nums = {0,1,0,3,12};
        test.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums1 = {0};
        test.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1));


    }

    public void moveZeroes(int[] nums) {
        int[] prevZ = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            prevZ[i] = count;
            if(nums[i] == 0){
                count++;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i - prevZ[i], i);
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;

    }
}
