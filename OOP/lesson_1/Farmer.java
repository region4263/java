package OOP;

// --------- фермер ---------
public class Farmer extends Person {

    private boolean delivery;

    public Farmer(String name) {
        super(name,1, 1, new int[]{0, 1},1, 3);
        delivery = true;
    }

    @Override
    public String getInfo() {
        return String.format("%s delivery: %b", super.getInfo(), delivery);
    }

    public String genInfoAboutPerson() { return "Крестьянин - это юнит с минимальными показателями среди " +
            "всех остальных персонажей. Отличительной особенностью является способность подносить стрелкам стрелы."; }

}
