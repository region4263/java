package OOP;

// --------- копейщик ---------
public class Spearman extends Person {

    public Spearman(String name) {
        super(name,4, 5, new int[]{1, 3},10, 4);
    }

    public String genInfoAboutPerson() { return "Копейщик - бесстрашный воин, без боязни вступающий в бой с противником." +
            "Уступает по показателям разбойнику, кроме защиты"; }
}
