package lesson_two_homework;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        genComb(0, n, k, new ArrayList<>());
        return ans;
    }

    private void genComb(int cur, int n, int k, List<Integer> curComb) {
        if (curComb.size() == k) {
            ans.add(new ArrayList<>(curComb));
            return;
        }

        for (int i = cur + 1; i <= n; i++) {
            curComb.add(i);
            genComb(i, n, k, curComb);
            curComb.remove(curComb.size() - 1);
        }
    }
}