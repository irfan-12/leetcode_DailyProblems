class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        HashMap<Integer,Integer> map1 = new HashMap<>(); 
        HashMap<Integer,Integer> map2 = new HashMap<>(); 
        int max1 = 0 , max2 = 0;
        for(int i = 0; i < n; i++) {
            map1.put(tops[i], map1.getOrDefault(tops[i], 0) + 1);
            map2.put(bottoms[i], map2.getOrDefault(bottoms[i], 0) + 1);
        }
        
        int key1 = 0, key2 = 0;
        for(Map.Entry<Integer,Integer> ent : map1.entrySet()){
            int val = ent.getValue();
            if(val > max1) {
                key1 = ent.getKey();
                max1 = val;
            }
        }
        for(Map.Entry<Integer,Integer> ent : map2.entrySet()){
            int val = ent.getValue();
            if(val > max2){
                key2 = ent.getKey();
                max2 = val;
            }
        }
        
        
        int res1 = check(key1, tops, bottoms);
        
        int res2 = check(key2, tops, bottoms);
        
        if (res1 == -1 && res2 == -1) return -1;
        if (res1 == -1) return res2;
        if (res2 == -1) return res1;
        return Math.min(res1, res2);
    }
    
    private int check(int target, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            } else if (tops[i] != target) {
                rotationsTop++;
            } else if (bottoms[i] != target) {
                rotationsBottom++;
            }
        }
        return Math.min(rotationsTop, rotationsBottom);
    }
}
