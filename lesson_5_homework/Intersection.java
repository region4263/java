package lesson_5_homework;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        Set<Integer> setNums1 = new HashSet<>();
        for (int i : nums1) {
            setNums1.add(i);
        }

        Set<Integer> set = new HashSet<>();
        for (int j : nums2) {
            if (setNums1.contains(j)) {
                set.add(j);
            }
        }

        int[] array = new int[set.size()];
        int i = 0;
        for (int num : set) {
            array[i++] = num;
        }
        return array;
    }
}
