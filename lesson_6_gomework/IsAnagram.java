package lesson_6_homework;

import java.util.*;

public class IsAnagram {
    public static void main(String[] args) {
        String s = "aanagram";
        String t = "nnagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        // ----- вариант №1 -----
        if (s.length() != t.length()) {
            return false;
        }

        char[] string1 = s.toCharArray();
        char[] string2 = t.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1, string2);


//        ----- вариант №2 - через Мар -----
//        Map<Character, Integer> mapString1 = new HashMap<>();
//        Set<Character> temp1 = new HashSet<>();
//        int count = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            char curChar = s.charAt(i);
//            if (!temp1.contains(curChar)) {
//                temp1.add(curChar);
//                for (int j = i; j < s.length(); j++) {
//                    if (s.charAt(j) == curChar) {
//                        count += 1;
//                    }
//                }
//                mapString1.put(curChar, count);
//                count = 0;
//            }
//        }
//
//        Map<Character, Integer> mapString2 = new HashMap<>();
//        Set<Character> temp2 = new HashSet<>();
//
//        for (int i = 0; i < t.length(); i++) {
//            char curChar = t.charAt(i);
//            if (!temp2.contains(curChar)) {
//                temp2.add(curChar);
//                for (int j = i; j < t.length(); j++) {
//                    if (t.charAt(j) == curChar) {
//                        count += 1;
//                    }
//                }
//                mapString2.put(curChar, count);
//                count = 0;
//            }
//        }
//
//        Set<Character> intersection = new HashSet<>(temp1);
//        intersection.removeAll(temp2);
//
//        if (temp1.size() != temp2.size() || !intersection.isEmpty())
//            return false;
//
//        for (Character elem : temp1) {
//            if (!mapString1.get(elem).equals(mapString2.get(elem))) {
//                return false;
//            }
//        }
//        return true;
    }
}
