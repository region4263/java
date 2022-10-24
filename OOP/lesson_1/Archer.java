package OOP;

// --------- арбалетчик ---------
public class Archer extends Person {

    public Archer(String name) {
        super(name,6, 3, new int[]{2, 3},10, 4);
        String archer = "archer";
        super.setArrows(archer, 16);
    }

    @Override
    public String getInfo() {
        return String.format("%s, arrows: %d", super.getInfo(), super.getArrows());
    }

    public String genInfoAboutPerson() { return "Арбалетчик - как и снайпер является стрелком, однако уступающий ему " +
            "по всем показателям"; }
}
