class Solution {
    public int numberOfAlternatingGroups(int[] color, int k) {
        int n = color.length;
        int N = n + (k-1);
        int arr[] = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = color[i%n];
        }
        int res = 0 ,i = 0 , j =1;
        while(j<N){
            if(arr[j]==arr[j-1]){
                i = j;
                j++;
                continue;
            }
            if(j-i+1==k){
                res++;
                i++;
            }
            j++;
        }
        
        return res;
    }
}