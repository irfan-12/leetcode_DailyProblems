class Solution {
    public int countLargestGroup(int n) {
        int arr[] = new int[37];
        for(int i=1;i<=n;i++){
            int dup = i,sum = 0;
            while(dup>0){
                int rem = dup % 10;
                sum += rem;
                dup /= 10;
            }
            arr[sum]++;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr) map.put(num,map.getOrDefault(num,0)+1);
        int max = 0, cnt =0;
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            int key = ent.getKey();
            int val = ent.getValue();
            if(key>=max){
            max = key;
            cnt = val;    
            } 

        }
        return cnt;
    }
}