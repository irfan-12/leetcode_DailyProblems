class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int arr1[] = new int[n];
        HashMap<Integer,Integer> clr = new HashMap<>();        
        HashMap<Integer,Integer> dup = new HashMap<>();        

        for(int i=0;i<n;i++){
            if(dup.containsKey(queries[i][0])){
                int prev = dup.get(queries[i][0]);
                clr.put(prev,clr.get(prev)-1);

                if(clr.get(prev) == 0){
                    clr.remove(prev);
                }

            }
            dup.put(queries[i][0],queries[i][1]);

            clr.put(queries[i][1],clr.getOrDefault(queries[i][1],0)+1);

            arr1[i] = clr.size();
            
        }
       
       
        return arr1;
    }
}