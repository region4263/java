package OOP;

// --------- монах ---------
public class Monk extends Person {

    private boolean magic;

    public Monk(String name) {
        super(name, 12, 7, new int[]{-4, -4},30, 5);
        magic = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s magic: %b", super.getInfo(), magic);
    }

    public String genInfoAboutPerson() { return "Монах - это юнит, обладающий, как и колдун, большим здоровьем, " +
            "но уступающий ему по остальынм показателсям.Обладает способностью лечить других юнитов"; }
}
