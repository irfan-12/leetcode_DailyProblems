class Solution {
    public boolean isArraySpecial(int[] nums) {
        int cnt = 0,n=nums.length;
        if(n<2)
        return true;
        for(int i=1;i<n;i++){
            if((nums[i-1]%2==0 && nums[i]%2!=0) || (nums[i-1]%2!=0 && nums[i]%2==0))
            cnt++;
        }
        return cnt == n-1 ? true:false;
    }
}