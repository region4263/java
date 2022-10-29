package OOP;

// --------- фермер ---------
public class Farmer extends Person {

    private static int number = 0;
    private boolean delivery;

    public Farmer() {
        super(String.format("Farmer#%d", ++Farmer.number),1, 1, new int[]{0, 1},1, 3, "Крестьянин - это юнит с минимальными показателями среди " +
                "всех остальных персонажей.\nОтличительной особенностью является способность подносить стрелкам стрелы.");
        delivery = true;
    }

    public String getInfo() {
        return String.format("%s delivery: %b", super.getInfo(), delivery);
    }
}
