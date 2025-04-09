class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> dis = new HashSet<>();
        int min=Integer.MAX_VALUE;
        for(int num : nums) min=Math.min(min,num);
        if(min<k) return -1;
        for(int num : nums) dis.add(num);
        int size = dis.size();
        return size-(min==k?1:0);
    }
}