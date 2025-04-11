class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt=0;
       for(int i=low;i<=high;i++){
        String str=String.valueOf(i);
        int len=str.length();
        if(len%2!=0)    continue;
        int mid=len/2;
        int sum1=0;
        int sum2=0;
    
        for(int j=0;j<mid;j++){
            sum1+=str.charAt(j);
            sum2+=str.charAt(mid+j);
           
            
        
        }
            if(sum1==sum2){
            cnt++;
            
        
        }
        }
    
        return cnt;
       }
            
}