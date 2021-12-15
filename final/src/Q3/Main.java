package Q3;

public class Main {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        //prefixsum
        int[] presum = new int[nums.length];
        int tmp = 0;
        for(int i = 0; i < nums.length; i++) {
            tmp += nums[i];
            presum[i] = tmp;
        }
        int count = 0;
        for(int i = 0; i < presum.length; i++) {
            for(int j = 0; j <= i; j++) {
                if(presum[i] - presum[j] + nums[j] == k) {
                    count++;
                }
            }
        }
        return count;
    }



}
