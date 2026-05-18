class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int suff=1;
        for(int k=nums.length-2;k>=0;k--){
            suff*=nums[k+1];
            result[k]=result[k]*suff;
        }
        return result;
    }
}  
