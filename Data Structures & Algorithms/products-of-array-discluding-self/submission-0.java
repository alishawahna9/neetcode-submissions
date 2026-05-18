class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] pref=new int[nums.length];
        int[] suff=new int[nums.length];
        pref[0]=1;
        suff[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pref[i]=pref[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            suff[j]=suff[j+1]*nums[j+1];
        }

        int[] result=new int[nums.length];
        for(int k=0;k<nums.length;k++){
            result[k]=pref[k]*suff[k];
        }
        return result;
    }
}  
