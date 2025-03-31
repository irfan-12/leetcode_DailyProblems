class Solution {
    public long putMarbles(int[] weights, int k) {
        if(k==1) return 0;
        int len = weights.length;
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<len-1;i++) li.add(weights[i]+weights[i+1]);
        Collections.sort(li);
        long min=0 , max=0;
        for(int i=0;i<k-1;i++){
            min += li.get(i);
            max += li.get(li.size()-1-i);
        }
        return max - min;
    }
}