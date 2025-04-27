class Solution {
    public int countSubarrays(int[] nums) {
        int i=0,j=2,cnt=0,n=nums.length;
        while(j<n){
            if((nums[i]+nums[j]) * 2 ==  nums[i+1]) cnt++;
            i++;
            j++;
        }
        return cnt;
    }
}