class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // בדיקה אם החצי השמאלי ממוין
            if (nums[left] <= nums[mid]) {
                // בדיקה אם המטרה נמצאת בתוך הטווח הממוין השמאלי
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // חיפוש בשמאל
                } else {
                    left = mid + 1; // חיפוש בימין
                }
            } 
            // אחרת, החצי הימני חייב להיות ממוין
            else {
                // בדיקה אם המטרה נמצאת בתוך הטווח הממוין הימני
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // חיפוש בימין
                } else {
                    right = mid - 1; // חיפוש בשמאל
                }
            }
        }

        return -1; // המטרה לא נמצאה
    }
}
