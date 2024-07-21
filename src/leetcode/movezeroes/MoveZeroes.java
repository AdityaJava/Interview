package leetcode.movezeroes;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < nums.length; i++) {
            if (j != -1 && nums[i] != 0) {
                swap(i, j, nums);
                j++;
            }
        }

    }

    private static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // int[] nums = new int[]{0, 1, 0, 3, 12};
        //int[] nums = new int[]{0};
        //int[] nums = new int[]{1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int[] nums = new int[]{1};

        MoveZeroes.moveZeroes(nums);
        System.out.println("DOne");
    }
}