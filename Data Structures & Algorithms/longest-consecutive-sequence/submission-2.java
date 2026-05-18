class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int count=0;
        int max=1;
        for(Integer num :set){
            if(!set.contains(num-1)){
                while(set.contains(num)){
                    count++;
                    num++;
                }
                max=Math.max(max,count);
            }
            count=0;
        }
        return max;
    }
}
