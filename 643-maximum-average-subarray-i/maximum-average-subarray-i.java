class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }

        int i=0;
        int j=k-1;
        List<Integer> l=new ArrayList<>();
        while(j<nums.length){
            if(j==k-1){
                l.add(sum);
            }
            else{
                sum=sum-nums[i-1]+nums[j];
                l.add(sum);
            }
            i=i+1;
            j=j+1;
        }

        double average = (double) Collections.max(l) / k;
        return average;
        
    }
}