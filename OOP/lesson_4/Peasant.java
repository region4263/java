package GIT;

import java.util.List;

public class Peasant extends BaseHero {

    private boolean delivery;

    public Peasant(List<BaseHero> side, int x, int y) {
        super(String.format("Peasant#%d", ++Peasant.number), 1, 1, 1, 0, new int[]{1, 0}, 3);
        delivery = true;
        position = new Vector2(x, y);
    }

    @Override
    public String getInfo() {
        return String.format("%s  delivery: %b", super.getInfo(), delivery);
    }
}
