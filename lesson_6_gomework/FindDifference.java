package lesson_6_homework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        List<Integer> first = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                first.add(num);

            }
        }

        List<Integer> second = new ArrayList<>();
        for (int num : set2) {
            if (!set1.contains(num)) {
                second.add(num);

            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(first);
        ans.add(second);

        return ans;
    }
}
