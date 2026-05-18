class Solution {
    public int trap(int[] height) {
        if(height.length<=2){
            return 0;
        }
        int l=0;
        int minL=height[l];
        int r=height.length-1;
        int minR=height[r];
        int max=0;
        while(l<r){
        if(minL<=minR){
            l++;
            if(minL<height[l]){
                minL=height[l];
            }
            if(height[l]<minL){
                max+=minL-height[l];
            }
        }
        else{
            r--;
            if(minR<height[r]){
                minR=height[r];
            }
            if(height[r]<minR){
                max+=minR-height[r];
            }
        }

        }
        return max;
    }
}
