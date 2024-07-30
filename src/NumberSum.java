
class NumberSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int idx = 0; idx < nums.length - 1; idx++) {
            for(int idy = 1; idy < nums.length; idy++) {
                if(nums[idx] + nums[idy] == target && idx != idy) {
                    int[] result = {idx, idy};
                    return result;
                }
            }
        }
        return new int[] {0};
    }
    
    public static void main(String args[]) {
    	int[] result = twoSum(new int[] {1,2,3,4}, 4);
    	System.out.println(result[0] + " " + result[1]);
    }
}