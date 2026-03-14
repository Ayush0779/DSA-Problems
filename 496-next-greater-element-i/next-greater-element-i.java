class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> d=new ArrayDeque<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            while(!d.isEmpty() && d.peek()<nums2[i]){
                m.put(d.pop(),nums2[i]);
            }
            d.push(nums2[i]);
        }

        int[] a=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            a[i] = m.getOrDefault(nums1[i], -1);
        }
        return a;
    }
}