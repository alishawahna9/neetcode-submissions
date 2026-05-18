class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        int idx=0;

        for(int left=0;left<nums.length-2;left++){
            if(left>0&&nums[left]==nums[left-1]){
                continue;
            }
            int mid=left+1;
            int right=nums.length-1;
            while(mid<right){
                int sum=nums[left]+nums[mid]+nums[right];

                if(sum==0){
                    result.add(new ArrayList<>());
                    result.get(idx).add(nums[left]);
                    result.get(idx).add(nums[mid]);
                    result.get(idx).add(nums[right]);
                    idx++;
                    while(mid+1<=nums.length-2&&nums[mid]==nums[mid+1]) mid++;
                    while(mid<right&&nums[right-1]==nums[right]) right--;
                    mid++;
                    right--;
                }
                else if(sum<0){
                    mid++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}
