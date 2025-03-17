class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
        for(Map.Entry<Integer,Integer> ent : map.entrySet()){
            if(ent.getValue()%2!=0)
            return false;
        }
        return true;
    }
}