class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int left = 0; left < nums.length - 2; left++) {
            // דלג על כפילויות של left
            if (left > 0 && nums[left] == nums[left - 1]) continue;

            int mid = left + 1;
            int right = nums.length - 1;

            while (mid < right) {
                int sum = nums[left] + nums[mid] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    // דלג על כפילויות של mid ו-right
                    while (mid < right && nums[mid] == nums[mid + 1]) mid++;
                    while (mid < right && nums[right] == nums[right - 1]) right--;
                    mid++;
                    right--;
                }
                else if (sum < 0) {
                    mid++;  // צריך להגדיל את הסכום
                }
                else {
                    right--;  // צריך להקטין את הסכום
                }
            }
        }

        return result;
    }
}

