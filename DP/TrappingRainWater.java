package DP;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int[] nextGreatestElementLeft = new int[height.length];
        int[] nextGreatestElementRight = new int[height.length];

        int max = 0;
        for (int i = 0; i < height.length; i++) {
            max = Math.max(max, height[i]);
            nextGreatestElementLeft[i] = max;
        }

        max = 0;
        for (int i = height.length - 1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            nextGreatestElementRight[i] = max;
        }

        int waterContained = 0;
        for (int i = 0; i < height.length; i++) {
            int water = Math.min(nextGreatestElementLeft[i], nextGreatestElementRight[i]) - height[i];
            if (water > 0) {
                waterContained += water;
            }

        }

        return waterContained;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(arr));
    }

}
