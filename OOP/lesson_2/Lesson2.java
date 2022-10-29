package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {

        List<Person> group1 = new ArrayList<>();
        List<Person> group2 = new ArrayList<>();

        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    group1.add(new Farmer());
                    break;
                case 1:
                    group1.add(new Robber());
                    break;
                case 2:
                    group1.add(new Sniper());
                    break;
                case 3:
                    group1.add(new Witch());
                    break;
                case 4:
                    group1.add(new Spearman());
                    break;
                case 5:
                    group1.add(new Archer());
                    break;
                default:
                    group1.add(new Monk());
                    break;
            }
        }

        for (int i = 1; i < 8; i++) {
            switch (rnd.nextInt(7)) {
                case 0:
                    group2.add(new Farmer());
                    break;
                case 1:
                    group2.add(new Robber());
                    break;
                case 2:
                    group2.add(new Sniper());
                    break;
                case 3:
                    group2.add(new Witch());
                    break;
                case 4:
                    group2.add(new Spearman());
                    break;
                case 5:
                    group2.add(new Archer());
                    break;
                default:
                    group2.add(new Monk());
                    break;
            }
        }

        System.out.println(" ------- group1 ------- ");
        for (Person per: group1) {

            System.out.println(per.getName());
            per.print();
            System.out.println();

        }


        System.out.println(" ------- group2 ------- ");
        for (Person per: group2) {

            System.out.println(per.getName());
            per.print();
            System.out.println();

        }
    }
}
