class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0] , max = 0;
        for(int i=1;i<n;i++){
            if(nums[i-1]<nums[i]){
                sum += nums[i];
            }
            else if(nums[i-1]>=nums[i]){
                max = Math.max(max,sum);
                sum = nums[i];
            }
        }
        return Math.max(max,sum);
    }
}