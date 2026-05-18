class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int length=0;
        int max=1;
        for(Integer num :set){
            if(!set.contains(num-1)){
                while(set.contains(num+length)){
                    length++;
                }
                max=Math.max(max,length);
            }
            length=0;
        }
        return max;
    }
}
