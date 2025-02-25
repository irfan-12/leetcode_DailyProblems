class Solution {
    public int numOfSubarrays(int[] arr) {
        int even = 1 , odd=0, n = 0 , prefix = 0;
        int mod = 1000000007;
        for(int num : arr){
            prefix += num;
            if(prefix%2==0){
                n = (n+odd)%mod;
                even++;
            }
            else{
                n = (n+even)%mod;
                odd++;
            }
        }
       return n;
    }
}