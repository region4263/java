package OOP;

// --------- разбойник ---------
public class Robber extends Person {

    private static int number = 0;

    public Robber() {
        super(String.format("Robber#%d", ++Robber.number),8, 3, new int[]{2, 4},10, 6, "Разбойник - беспощадный и " +
                "кровожадный злодей, скрывающийся в густых лесах.");
    }

//    public String getInfoAboutPerson() { return "Разбойник - беспощадный и кровожадный злодей, скрывающийся " +
//            "в густых лесах."; }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
