package array;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int res = 0;
        for (int i = 0; i < height.length; i++) {
            int localMax = 0;
            for (int j = i + 1; j < height.length; j++) {
                int local = Math.min(height[i], height[j]) * (j - i);
                if (localMax < local) {
                    localMax = local;
                }
            }
            if (res < localMax) {
                res = localMax;
            }
        }
        return res;
    }

    public int maxAreaSOTA(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) { // move the shorter one
                l++;
            } else {
                r--;
            }
        }
        return res;
    }

}
