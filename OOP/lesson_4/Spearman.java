package GIT;

import java.util.List;

public class Spearman extends BaseHero {

    public Spearman(List<BaseHero> band, int x, int y) {
        super(String.format("Spearman#%d", ++Spearman.number), 10, 4, 5, 0, new int[]{1, 3}, 4);
        position = new Vector2(x, y);
        super.setBand(band);
    }

}
