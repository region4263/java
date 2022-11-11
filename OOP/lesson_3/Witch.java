package OOP;

import java.util.List;

// --------- колдун ---------
public class Witch extends Person {

    private static int number = 0;
    private boolean magic;

    public Witch(List<Person> band, int a, int b) {
        super(String.format("Witch#%d", ++Witch.number),17, 12, new int[]{-5, -5},30, 9,
                "Колдун - это юнит, обладающий максимальными показателями по атаке, защите и здоровью среди " +
                        "\nостальных юнитов. Также отличительной особенностью является способность лечить других " +
                        "юнитов.", a, b);
        magic = true;
        super.setBand(band);
    }

    @Override
    public void step() {
        boolean flag = true;
        int cnt = 0;
        while (flag){
            if (band.get(cnt).health < band.get(cnt).maxHealth){
                band.get(cnt).health = band.get(cnt).health + 5;
                if (band.get(cnt).health > band.get(cnt).maxHealth) band.get(cnt).health = band.get(cnt).maxHealth;
                flag = false;
                System.out.println(band.get(cnt).getName() + " heald!");
                cnt = 0;
            }

            if (++cnt == band.size()) {
                flag = false;
                System.out.println("Nobody to heal((");
            }
        }
    }

    public String getInfo() {
        return String.format("%s, magic: %b", super.getInfo(), magic);
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
