package OOP;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {

        // --------- фермер ---------
        List<Person> farmerGroup = new ArrayList<>();
        Farmer farmer = null;

        for (int i = 1; i < 6; i++) {
            farmer = new Farmer(String.format("Fam%d", i));
            System.out.println(farmer.getInfo());
            farmerGroup.add(farmer);
        }
        System.out.println(farmer.genInfoAboutPerson());
        System.out.println();

        // --------- разбойник ---------
        List<Person> robberGroup = new ArrayList<>();
        Robber robber = null;

        for (int i = 1; i < 6; i++) {
            robber = new Robber(String.format("Rob%d", i));
            System.out.println(robber.getInfo());
            robberGroup.add(robber);
        }
        System.out.println(robber.genInfoAboutPerson());
        System.out.println();

        // --------- снайпер ---------
        List<Person> sniperGroup = new ArrayList<>();
        Sniper sniper = null;
        for (int i = 1; i < 6; i++) {
            sniper = new Sniper(String.format("Snip%d", i));
            System.out.println(sniper.getInfo());
            sniperGroup.add(sniper);
        }
        System.out.println(sniper.genInfoAboutPerson());
        System.out.println();

        // --------- колдун ---------
        List<Person> witchGroup = new ArrayList<>();
        Witch witch = null;
        for (int i = 1; i < 6; i++) {
            witch = new Witch(String.format("Wit%d", i));
            System.out.println(witch.getInfo());
            witchGroup.add(witch);
        }
        System.out.println(witch.genInfoAboutPerson());
        System.out.println();

        // --------- копейщик ---------
        List<Person> spearmanGroup = new ArrayList<>();
        Spearman spearman = null;
        for (int i = 1; i < 6; i++) {
            spearman = new Spearman(String.format("Spear%d", i));
            System.out.println(spearman.getInfo());
            spearmanGroup.add(spearman);
        }
        System.out.println(spearman.genInfoAboutPerson());
        System.out.println();

        // --------- арбалетчик ---------
        List<Person> archerGroup = new ArrayList<>();
        Archer archer = null;
        for (int i = 1; i < 6; i++) {
            archer = new Archer(String.format("Arch%d", i));
            System.out.println(archer.getInfo());
            archerGroup.add(archer);
        }
        System.out.println(archer.genInfoAboutPerson());
        System.out.println();

        // --------- монах ---------
        List<Person> monkGroup = new ArrayList<>();
        Monk monk = null;
        for (int i = 1; i < 6; i++) {
            monk = new Monk(String.format("Monk%d", i));
            System.out.println(monk.getInfo());
            monkGroup.add(monk);
        }
        System.out.println(monk.genInfoAboutPerson());
        System.out.println();
    }
}
