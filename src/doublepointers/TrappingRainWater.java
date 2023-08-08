package doublepointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
        height = new int[]{4, 2, 0, 3, 2, 5};
        System.out.println(trap(height));
        height = new int[]{4, 2, 3};
        System.out.println(trap(height));
    }

    public static int trap1(int[] height) {
        int volume = 0;
        int left = 0;
        int right = 0;
        while (right < height.length - 1) {
            while (height[left] < 1) {
                left++;
            }
            right = findClosest(height, left);
            int min = Math.min(height[left], height[right]);
            while (left < right - 1) {
                int t = min - height[++left];
                volume += t;
            }
            left = right;
        }
        return volume;
    }

    private static int findClosest(int[] nums, int left) {
        int right = left + 1;
        int residue = Integer.MAX_VALUE;
        int res = 0;
        while (right < nums.length) {
            if (nums[right] > nums[left])
                return right;
            int temp = Math.abs(nums[right] - nums[left]);
            if (temp <= residue) {
                res = right;
                residue = temp;
                if (temp == 0)
                    return res;
            }
            right++;
        }
        return res;
    }

    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = height[0], rightMax = height[height.length - 1];
        int water = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                if (leftMax < height[left]) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
            } else {
                right--;
                if (rightMax < height[right]) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
            }
        }
        return water;
    }


}
