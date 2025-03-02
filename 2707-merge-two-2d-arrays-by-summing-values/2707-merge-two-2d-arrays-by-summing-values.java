class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<nums1.length;i++){
            int key1 = nums1[i][0];
            int val1 = nums1[i][1];
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            int key2 = nums2[i][0];
            int val2 = nums2[i][1];
            map.put(key2,map.getOrDefault(key2,0)+val2);
        }
        int arr[][] = new int[map.size()][2];
        int i =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr[i][0] = entry.getKey();
            arr[i][1] = entry.getValue();
            i++;
            System.out.println("key: "+entry.getKey()+" value: "+entry.getValue());
        }
        return arr;
    }
}