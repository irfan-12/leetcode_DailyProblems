class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length,cnt = 0;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int digits = 0;
            while(num>0){
                digits++;
                num /= 10;
            }
            if(digits % 2 == 0) cnt++;
        }
        return cnt;
    }
}