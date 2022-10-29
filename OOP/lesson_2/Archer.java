package OOP;

// --------- арбалетчик ---------
public class Archer extends Person {

    private static int number = 0;

    public Archer() {
        super(String.format("Archer#%d", ++Archer.number),6, 3, new int[]{2, 3},10, 4, "Арбалетчик - как и снайпер " +
                "является стрелком, однако уступающий ему по всем показателям.");
        String archer = "archer";
        super.setArrows(archer, 16);
    }

    public String getInfo() {
        return String.format("%s, arrows: %d", super.getInfo(), super.getArrows());
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
