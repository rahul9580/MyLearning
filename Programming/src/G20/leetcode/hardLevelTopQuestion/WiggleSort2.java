package G20.leetcode.hardLevelTopQuestion;

/*
* Given an unsorted array nums, reorder it such that nums[0] < nums[1] > nums[2] < nums[3]...
* Example:
* Input: nums = [1, 5, 1, 1, 6, 4]
* Output: One possible answer is [1, 4, 1, 5, 1, 6]
*/
public class WiggleSort2 {

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void wiggleSort(int[] nums) {
        for(int i=0; i< nums.length-1; i++) {
            if((i%2==0 && nums[i]>nums[i+1]) || (i%2!=0 && nums[i]<nums[i+1])) {
                swap(nums, i, i+1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 2, 3, 1};
        wiggleSort(arr);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
