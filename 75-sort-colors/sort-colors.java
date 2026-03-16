class Solution {
    public void sortColors(int[] nums) {

        int low=0;
        int middle=0;
        int high=nums.length-1;
        int temp=0;

        while(middle<=high){
            if(nums[middle]==0){
                temp=nums[middle];
                nums[middle]=nums[low];
                nums[low]=temp;
                low=low+1;
                middle=middle+1;
            }else if(nums[middle]==2){
                temp=nums[middle];
                nums[middle]=nums[high];
                nums[high]=temp;
                high=high-1;
            }else{
                middle=middle+1;
            }
        }
        
        
        
    }
}