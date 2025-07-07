import java.util.Arrays;

public class FirstLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);
        return new int[]{first, last};
    }

    private static int findPosition(int[] nums, int target, boolean findFirst) {
        int low = 0, high = nums.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                if (findFirst) high = mid - 1; // search left
                else low = mid + 1; // search right
            } else if (nums[mid] < target) low = mid + 1;
            else high = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
