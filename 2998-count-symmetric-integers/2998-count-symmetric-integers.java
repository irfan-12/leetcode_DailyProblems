class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        if((low>1 && high<11) || (low>99 && high<1001)) return 0;
        for(int i=low;i<=high;i++){
            int sum1 = 0 , sum2 = 0;
            if((i>10 && i<100) || (i>1000 && i<10000)){
            String str = String.valueOf(i);
            int len = str.length();
            int mid = len/2;
            String part1 = str.substring(0,mid);
            int st1 = Integer.parseInt(part1);
            String part2 = str.substring(mid);
            int st2 = Integer.parseInt(part2);
            System.out.print(st1+" "+st2+" ");
            while(st1>0){
                sum1 = sum1 + (st1%10);
                st1 /= 10;
            }
            while(st2>0){
                sum2 = sum2 + (st2%10);
                st2 /= 10;
            }
            }
            if(sum1==sum2 && (sum1>0&&sum2>0)){
                cnt++;
                System.out.print(i+" ");
            }

        }
        return cnt;
    }
}