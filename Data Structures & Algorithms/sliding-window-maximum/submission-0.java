class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<k;i++){
            maxHeap.add(nums[i]);
        }

        int[] result=new int[nums.length-k+1];

        result[0]=maxHeap.peek();

        int idx=1;
        int left=0;
        int right=k-1;

        while(right<nums.length){
            maxHeap.remove(nums[left]);
            left++;
            right++;
            if(right<nums.length) maxHeap.add(nums[right]);
            if(idx<result.length) result[idx]=maxHeap.peek();
            idx++;
        }

        return result;
    }
}
