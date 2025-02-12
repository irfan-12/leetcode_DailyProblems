class Solution {
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            int val = nums[i];
            int sum = 0;
            while(val>0){
                int rem = val%10;
                sum += rem;
                val /=10;
            }
            arr[i] = sum;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = -1;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                result = Math.max(result,map.get(arr[i])+nums[i]);
            }
            map.put(arr[i],Math.max(map.getOrDefault(arr[i],Integer.MIN_VALUE),nums[i]));
            
        }
        return result;
    }
}