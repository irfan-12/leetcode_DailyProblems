class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        int i = 0, j = k-1;
        char ch[] = blocks.toCharArray();
        int n = ch.length;
        while(i<=j && j<n){
            int cnt = 0;
            for(int l=i;l<=j;l++){
            if(ch[l]=='W'){
                cnt++;
            }
            }
            if(cnt < min)
            min = cnt;
            i++;
            j++;
        }
        return min;
    }
}