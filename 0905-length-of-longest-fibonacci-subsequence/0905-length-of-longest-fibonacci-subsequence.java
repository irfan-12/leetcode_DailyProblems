class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length,max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        int t[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                t[i][j] = 2;
            }
        }
        for(int j=1;j<n;j++){
            for(int k = j+1 ;k<n;k++){
                int target = arr[k] - arr[j];
                if(map.containsKey(target) && map.get(target) < j){
                    int i = map.get(target);
                    t[j][k] = t[i][j]+1;
                }
                max = Math.max(max,t[j][k]);
        }
        }
        return max>=3?max:0;
    }
}