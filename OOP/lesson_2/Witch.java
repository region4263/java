package OOP;

// --------- колдун ---------
public class Witch extends Person {

    private static int number = 0;
    private boolean magic;

    public Witch() {
        super(String.format("Witch#%d", ++Witch.number),17, 12, new int[]{-5, -5},30, 9, "Колдун - это юнит, обладающий" +
                " максимальными показателями по атаке, защите и здоровью среди \nостальных юнитов. Также " +
                "отличительной особенностью является способность лечить других юнитов.");
        magic = true;
    }

    public String getInfo() {
        return String.format("%s magic: %b", super.getInfo(), magic);
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
