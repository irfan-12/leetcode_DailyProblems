class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        TreeMap<Integer,Integer> tp = new TreeMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tp.put(grid[i][j],tp.getOrDefault(grid[i][j],0)+1);
            }
        }
        int c = 1;
        int arr[] = new int[2];
        boolean flag = false;
        for(Map.Entry<Integer,Integer> num : tp.entrySet()){
            int key = num.getKey();
            int value = num.getValue();
            if(key != c){
                arr[1] = c;
                flag = true;
                break;
            }
            c++;
            System.out.print("key: "+key+" value: "+value);
        }
        if(!flag){
            arr[1] = c;
        }
         for(Map.Entry<Integer,Integer> num : tp.entrySet()){
            int key = num.getKey();
            int value = num.getValue();
            if(value==2){
                arr[0] = key;
            }
         }
        return arr;
    }
}