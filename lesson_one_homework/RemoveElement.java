package lesson_one_homework;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int carry = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[carry++] = nums[i];
            }
        }
        return carry;
    }
}
