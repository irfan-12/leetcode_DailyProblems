import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        long bad = 0;

        map.put(nums[0], map.getOrDefault(nums[0] - 0, 0) + 1);

        for (int i = 1; i < n; i++) {
            int bef = i;
            int val = 0;

            if (map.containsKey(nums[i] - i)) {
                val = map.get(nums[i] - i);
            }

            bad += bef - val;
            map.put(nums[i] - i, map.getOrDefault(nums[i] - i, 0) + 1);
        }

        return bad;
    }
}
