package lesson_one_homework;

public class ReverseWords {
    public String reverseWords(String str) {
        StringBuilder ans = new StringBuilder();
        StringBuilder s = new StringBuilder();
        s.append(str).reverse();

        int finish = s.length();
        int start = 0;
        while (start < finish) {
            while (start < finish && s.charAt(start) == ' ') {
                start++;
            }

            if (start == finish) {
                break;
            }

            int end = start + 1;
            while (end < finish && s.charAt(end) != ' ') {
                end++;
            }

            ans.append(rev(s.substring(start, end)));
            start = end + 1;
        }

        return ans.deleteCharAt(0).toString();
    }

    private static String rev(String txt) {
        StringBuilder revTxt = new StringBuilder();
        revTxt.append(txt).append(" ");
        return revTxt.reverse().toString();
    }
}
