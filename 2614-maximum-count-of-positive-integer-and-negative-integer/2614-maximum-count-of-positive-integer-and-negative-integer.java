class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length,neg = 0 , pos = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<0) neg++;
            else if(nums[i]>0) pos++;
        }
        return Math.max(neg,pos);
    }
}