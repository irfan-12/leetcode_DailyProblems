class Solution {
    public int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                arr.add(i);
            }
        }
        int ar[] = {-1,-1};
        int diff = 0,min = Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            diff = arr.get(i+1) - arr.get(i);
            if(diff<min){
                min = diff;
                ar[0] = arr.get(i);
                ar[1] = arr.get(i+1);
            }
        }
        return ar;
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}