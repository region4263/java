package GIT;

import java.util.List;

public class Sniper extends BaseHero {

    public Sniper(List<BaseHero> band, int x, int y) {
        super(String.format("Sniper#%d", ++Sniper.number), 15, 12, 10, 32, new int[]{8, 10}, 9);
        position = new Vector2(x, y);
        super.setBand(band);
    }

    @Override
    public void step(List<BaseHero> side) {
        float tmpH = side.get(0).health;
        int index = 0;
        for (int i = 1; i < side.size(); i++) {
            if (tmpH > side.get(i).health) {
                tmpH = side.get(i).health;
                index = i;
            }
        }
        band.get(index).getDamaged((damage.x+damage.y)/2);
    }
}
