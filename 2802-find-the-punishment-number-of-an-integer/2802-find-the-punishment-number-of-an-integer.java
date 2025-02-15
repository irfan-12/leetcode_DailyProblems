class Solution {
    public static boolean fun(int sq , int sum ,int num){
       if(sq==0){
        return sum == num;
       }
        return fun(sq/10,sum+sq%10,num) || fun(sq/100,sum+sq%100,num) || fun(sq/1000,sum+sq%1000,num) || fun(sq/10000,sum+sq%10000,num);
    }

    public int punishmentNumber(int n) {
        int res = 0;
        for(int i=1;i<=n;i++){
            if(fun(i*i, 0 , i) == true){
                res += i * i;
            }
        }
        return res;
    }
}