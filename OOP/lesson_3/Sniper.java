package OOP;

// --------- снайпер ---------
public class Sniper extends Person {

    private static int number = 0;

    public Sniper(int a, int b) {
        super(String.format("Sniper#%d", ++Sniper.number),12, 10, new int[]{8, 10}, 15, 9,
                "Снайпер - меткий стрелок, наносящий противнику большой урон и имеющий с собой определенный " +
                        "запас стрел.", a, b);
        String str = "sniper";
        super.setArrows(str, 32);
    }


    public String getInfo() {
        return String.format("%s, arrows: %d", super.getInfo(), super.getArrows());
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
