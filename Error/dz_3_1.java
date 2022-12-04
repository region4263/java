package Error.dz_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class dz_3_1 {
    public static void main(String[] args) {
        try{
            String[] words = dataEnter();
            parsingData(words);
            writer(words);
        } catch (IOException e) {
            System.out.println("ОШИБКА!!! не верный ввод ("+ e +")");
        }
    }

    public static String[] dataEnter() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String data;
        data = scanner.nextLine();
        String[] words = data.split("\\s");

        int cnt = words.length;

        if (cnt < 6) {
            throw new IOException("введено меньше данных, чем требуется");
        } else if (cnt > 6) {
            throw new IOException("введено больше данных, чем требуется");
        }
        return words;
    }

    public static void parsingData(String[] words) throws IOException {
        for (int i = 0; i < 6; i++) {
            if (i == 0 || i == 1 || i == 2) {
                boolean onlyLatinAlphabet = words[i].matches("^[а-яА-ЯёЁ]+$");
                if (!onlyLatinAlphabet) {
                    throw new IOException("\"" + words[i] + "\"" + "- не соответствует требуемому формату (вводить буквами)");
                }
            }

            if (i == 3) {
                String[] element = words[i].split("\\.");
                boolean onlyDigitDay = element[0].matches("^[0-9]+$");
                boolean onlyDigitManth = element[1].matches("^[0-9]+$");
                boolean onlyDigitYear = element[2].matches("^[0-9]+$");
                if (element.length != 3) {
                    throw new IOException("\"" + words[i] + "\"" + "- формат даты не верен");
                } else if (!onlyDigitDay || element[0].length() != 2 || Integer.parseInt(element[0]) > 31 ||
                        Integer.parseInt(element[0]) < 1) {
                    throw new IOException("\"" + words[i] + "\"" + "- день введён не верно");
                } else if (!onlyDigitManth || element[1].length() != 2 || Integer.parseInt(element[1]) > 12 ||
                        Integer.parseInt(element[0]) < 1) {
                    throw new IOException("\"" + words[i] + "\"" + "- месяц введён не верно");
                } else if (!onlyDigitYear || element[2].length() != 4 || Integer.parseInt(element[2]) < 1) {
                    throw new IOException("\"" + words[i] + "\"" + "- год введён не верно");
                }
            }

            if (i == 4) {
                boolean onlyDigitPhone = words[i].matches("^[0-9]+$");
                if (!onlyDigitPhone || words[i].length() != 11) {
                    throw new IOException("\"" + words[i] + "\"" + "- номер введён не верно");
                }
            }

            if (i == 5) {
                boolean mf = words[i].matches("^[mf]+$");
                if (!mf || words[i].length() != 1) {
                    throw new IOException("\"" + words[i] + "\"" + "- пол введён не верно");
                }
            }
        }
        System.out.println("данные введены корректно");
    }

    public static void writer(String[] words) {
        try (FileWriter writer = new FileWriter(words[0])) {
            for (String tmp: words) {
                writer.append("<").append(tmp).append(">");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
