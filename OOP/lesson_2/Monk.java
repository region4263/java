package OOP;

// --------- монах ---------
public class Monk extends Person {

    private static int number = 0;
    private boolean magic;

    public Monk() {
        super(String.format("Monk#%d", ++Monk.number), 12, 7, new int[]{-4, -4},30, 5, "Монах - это юнит, обладающий, " +
                "как и колдун, большим здоровьем, но уступающий ему \nпо остальынм показателсям. Обладает " +
                "способностью лечить других юнитов.");
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
