package OOP;

// --------- колдун ---------
public class Witch extends Person {

    private boolean magic;

    public Witch(String name) {
        super(name,17, 12, new int[]{-5, -5},30, 9);
        magic = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s magic: %b", super.getInfo(), magic);
    }

    public String genInfoAboutPerson() { return "Колдун - это юнит, обладающий максимальными показателями по атаке, " +
            "защите и здоровью среди остальных юнитов. Также отличительной особенностью является способность " +
            "лечить других юнитов"; }
}
