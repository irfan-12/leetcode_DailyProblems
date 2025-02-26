class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int curmaxsum = nums[0], curminsum = nums[0] , maxsum = nums[0], minsum = nums[0];
        for(int i=1;i<nums.length;i++){
            curmaxsum = Math.max(nums[i],curmaxsum+nums[i]);
            maxsum = Math.max(maxsum,curmaxsum);
            curminsum = Math.min(nums[i],curminsum+nums[i]);
            minsum = Math.min(minsum,curminsum);
        }
        return Math.max(Math.abs(maxsum),Math.abs(minsum));
    }
}