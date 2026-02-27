
class Solution {
    public int[] plusOne(int[] digits) {

        int l=digits.length;
        int carry=1;
        for(int i=l-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]=digits[i]+carry;
                carry=0;
                break;
                
            }
            else{
                digits[i]=0;
            }
        }

        if(carry==1){
            int[] result=new int[l+1];
            result[0]=1;
            return result;
        }

        return digits;           
        
    }
}