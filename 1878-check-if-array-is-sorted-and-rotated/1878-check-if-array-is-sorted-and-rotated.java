class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int v = 0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                v++;
            }
        }
        if(nums[n-1]>nums[0]){
            v++;
        }
        return v<=1;
    }
}