class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> mul = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                mul.put(nums[i]*nums[j],mul.getOrDefault(nums[i]*nums[j],0)+1);
            }
        }
        int cnt = 0;
        for(Map.Entry<Integer,Integer> entry : mul.entrySet()){
            if(entry.getValue()>=2){
                cnt += entry.getValue()*(entry.getValue()-1)/2;
            }
        }
        return cnt*8;
    }
}