package OOP;

// --------- снайпер ---------
public class Sniper extends Person {

    public Sniper(String name) {
        super(name,12, 10, new int[]{8, 10}, 15, 9);
        String sniper = "sniper";
        super.setArrows(sniper, 32);
    }

    @Override
    public String getInfo() {
        return String.format("%s, arrows: %d", super.getInfo(), super.getArrows());
    }

    public String genInfoAboutPerson() { return "Снайпер - меткий стрелок, наносящий противнику большой урон и " +
            "имеющий с собой определенный запас стрел"; }
}
