package lesson_6_homework;

import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> romanNumMap = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000);

        int result = 0;
        int currentNum;
        int nextNum;

        for (int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i));
            currentNum = romanNumMap.get(currentSymbol);

            if (i == s.length() - 1) {  // если осталась последняя римская цифра
                nextNum = currentNum;
            } else {
                nextNum = romanNumMap.get(String.valueOf(s.charAt(i + 1)));
            }

            if (currentNum >= nextNum) {
                result += currentNum;

            } else {
                result -= currentNum;
            }
        }

        return result;
    }
}
