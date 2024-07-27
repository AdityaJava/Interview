package leetcode.ReArrangeELementsBySign;

import java.util.Arrays;

public class ReArrangeElementsBySignOptimal {

    private int[] reArrangeElementsBySignOptimal(int[] nums) {
        int[] sortedArray = new int[nums.length];
        int positivePosition = 0;
        int negativePosition = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                sortedArray[positivePosition] = nums[i];
                positivePosition += 2;
            } else if (nums[i] < 0) {
                sortedArray[negativePosition] = nums[i];
                negativePosition += 2;
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        ReArrangeElementsBySignOptimal reArrangeElementsBySignOptimal = new ReArrangeElementsBySignOptimal();
        int[] sortedArray = reArrangeElementsBySignOptimal.reArrangeElementsBySignOptimal(nums);
        Arrays.stream(sortedArray).forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
