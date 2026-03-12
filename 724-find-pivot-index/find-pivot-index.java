class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix_sum=new int[nums.length];
        prefix_sum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix_sum[i]=prefix_sum[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(i==0){
                if(prefix_sum[nums.length-1]-prefix_sum[i]==0){
                    return 0;
                }
            }
            else if(i==nums.length){
                if(prefix_sum[i-1]==0){
                    return nums.length-1;
                }
            }
            else{
                if(prefix_sum[i-1]==prefix_sum[nums.length-1]-prefix_sum[i]){
                    return i;
                }
            }
        } 
        return -1;
    }
}