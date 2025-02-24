class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int sum = 0;
        for(int i=0;i<limits.length;i++)
        sum += limits[i];
        int[] arr = new int[sum];
        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
        }
        int l = 0;
        for(int i=0;i<grid.length;i++){
            
            int j = grid[i].length-1;
            while(limits[i]>0){
               arr[l] = grid[i][j];
               l++;
               j--;
               limits[i]--;

            } 
        }
        Arrays.sort(arr);
        long res = 0;
        int s = arr.length-1;
        while(k>0){
            res += arr[s];
            s--;
            k--;
        }
        return res;
    }
}