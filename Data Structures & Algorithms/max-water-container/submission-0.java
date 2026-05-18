class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        if(n==0){
            return 0;
        }
        int capacity;
        int left=0;
        int right=n-1;
        int width;
        int max=0;
        int size;
        while(left<right){
            width=right-left;
            size=width*Math.min(heights[left],heights[right]);
            if(size>max){
                max=size;
            }
            if(heights[right]>heights[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
