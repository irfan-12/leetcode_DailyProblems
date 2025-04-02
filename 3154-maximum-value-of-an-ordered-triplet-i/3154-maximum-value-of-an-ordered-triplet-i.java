class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxtrip = 0, maxdif = 0, maxele = 0;
       for(int num : nums){
        maxtrip = Math.max(maxtrip,maxdif*num);
        maxdif = Math.max(maxdif,maxele-num);
        maxele = Math.max(maxele,num);
       }
       return maxtrip;
    }
}