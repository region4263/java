package OOP;

// --------- разбойник ---------
public class Robber extends Person {

    public Robber(String name) {
        super(name,8, 3, new int[]{2, 4},10, 6);
    }

    public String genInfoAboutPerson() { return "Разбойник - беспощадный и кровожадный злодей, скрывающийся " +
            "в густых лесах"; }
}
