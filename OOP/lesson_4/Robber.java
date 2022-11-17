package GIT;

import java.util.List;

public class Robber extends BaseHero {

    public Robber(List<BaseHero> side, int x, int y) {
        super(String.format("Robber#%d", ++Robber.number), 10, 8, 3, 0, new int[]{2, 4}, 6);
        position = new Vector2(x, y);
    }
}
