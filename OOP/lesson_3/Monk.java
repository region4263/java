package OOP;

import java.util.List;

// --------- монах ---------
public class Monk extends Person {

    private static int number = 0;
    private boolean magic;

    public Monk(List<Person> band, int a, int b) {
        super(String.format("Monk#%d", ++Monk.number), 12, 7, new int[]{-4, -4},30, 5,
                "Монах - это юнит, обладающий, как и колдун, большим здоровьем, но уступающий ему " +
                        "\nпо остальынм показателсям. Обладает способностью лечить других юнитов.", a, b);
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
