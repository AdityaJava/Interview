package leetcode.arrays.nextpermutation;

import leetcode.Swapper;

//NOte: Dip index is a point after the remaining elements are in decreasing order
public class NextPermutation {

    private void findNextPermutation(int[] nums) {
        //Step1: To find the dipIndex. This is the index from where the remaining elements starts decreasing
        int n = nums.length;
        int dipIndex = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                dipIndex = i;
                break;
            }
        }


        if (dipIndex != -1) {
            //Step2: Swap with the first small greater element from right side
            for (int i = n - 1; i > dipIndex; i--) {
                if (nums[i] > nums[dipIndex]) {
                    Swapper.swap(nums, i, dipIndex);
                    break;
                }
            }
            //Step3: Reverse the list from next element from dipIndex
            reverseFrom(nums, dipIndex + 1, nums.length - 1);
        } else {
            reverseFrom(nums, 0, nums.length - 1);
        }
    }

    private static void reverseFrom(int[] nums, int fromPosition, int toPosition) {
        int i = fromPosition;
        int j = toPosition;

        while (i < j) {
            Swapper.swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        //int[] nums = {2, 1, 5, 4, 3, 0, 0};
        int[] nums = {3, 2, 1};

        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.findNextPermutation(nums);
//        NextPermutation.reverseFrom(nums, 1, nums.length - 1);
        System.out.println("sd");
    }
}
