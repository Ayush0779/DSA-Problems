class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 0;

        for (int num : set) {          // ← iterate set, not nums[]
            int temp = num;
            int tempLength = 1;
            if (!set.contains(temp - 1)) {
                while (set.contains(temp + 1)) {
                    tempLength++;
                    temp++;
                }
                maxLength = Math.max(maxLength, tempLength);
            }
        }
        return maxLength;
    }
}