class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        

        for(int k=0;k<nums.length-2;k++){

            if(k!=0 && nums[k]==nums[k-1]){
                continue;
            }

            int i=k+1;
            int j=nums.length-1;
            
            while(i<j){
            
                if(nums[k]+nums[i]+nums[j]==0){
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while(i<j && nums[i]==nums[i+1]) i++;
                    while(i<j && nums[j]==nums[j-1]) j--;
                    i++;
                    j--;            

                }
                else if(nums[k]+nums[i]+nums[j]>0){
                    j=j-1;
                }
                else{
                    i=i+1;
                }
           }
           
        }

        return result;
        
    }
}