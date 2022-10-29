package OOP;

// --------- копейщик ---------
public class Spearman extends Person {

    private static int number = 0;

    public Spearman() {
        super(String.format("Spearman#%d", ++Spearman.number),4, 5, new int[]{1, 3},10, 4, "Копейщик - бесстрашный воин, без" +
                " боязни вступающий в бой с противником.\nУступает по показателям разбойнику, кроме защиты.");
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + getInfoAboutPerson());
    }
}
