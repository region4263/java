package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson3 {

    public static void main(String[] args) {

        List<Person> group1 = new ArrayList<>();
        List<Person> group2 = new ArrayList<>();

        int x = 1;
        int y = 1;
        Random rnd = new Random();
        for (int i = 1; i <= 10; i++) {

            switch (rnd.nextInt(7)) {
                case 0 -> group1.add(new Farmer(x++, y));
                case 1 -> group1.add(new Robber(x++, y));
                case 2 -> group1.add(new Sniper(x++, y));
                case 3 -> group1.add(new Witch(group1, x++, y));
                case 4 -> group1.add(new Spearman(x++, y));
                case 5 -> group1.add(new Archer(x++, y));
                default -> group1.add(new Monk(group1, x++, y));
            }
        }

        x = 1;
        y = 10;
        for (int i = 1; i <= 10; i++) {
            switch (rnd.nextInt(7)) {
                case 0 -> group2.add(new Farmer(x++, y));
                case 1 -> group2.add(new Robber(x++, y));
                case 2 -> group2.add(new Sniper(x++, y));
                case 3 -> group2.add(new Witch(group2, x++, y));
                case 4 -> group2.add(new Spearman(x++, y));
                case 5 -> group2.add(new Archer(x++, y));
                default -> group2.add(new Monk(group2, x++, y));
            }
        }

        group1.forEach(n -> n.step());
        System.out.println();

        group2.forEach(n -> System.out.println(n.getName() + ", x: " + n.getX() + ", y: " + n.getY()));
    }

}
