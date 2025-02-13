class Solution {
    public int minOperations(int[] nums, int k) {
        int n = nums.length,cnt=0;
       PriorityQueue<Long> pq = new PriorityQueue<>();
       for(int num : nums){
        pq.add((long)num);
       }
       while(pq.size()>1 && pq.peek()<k){
        long fm = pq.poll();
        long sm = pq.poll();
        pq.add(fm*2+sm);
        cnt++;
        
       }
        return cnt;
    }
}