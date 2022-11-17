package GIT;

import java.util.List;

public abstract class BaseHero implements Actions {
    protected static int number;
    private String name;
    protected int attack;
    protected int defence;
    protected int shot;
    protected Vector2 damage;
    protected float health;
    protected int maxHealth;
    private int speed;
    private String status;
    protected List<BaseHero> band;
    protected Vector2 position;

    static {
        number = 0;
    }

    protected float getDist(Vector2 dist){
        float dx = position.x - dist.x;
        float dy = position.y - dist.y;
        return (float) Math.sqrt(dx*dx + dy*dy);
    }

    protected Vector2 getPosition() {return position;}

    protected void setBand(List<BaseHero> band){this.band = band;}

    public BaseHero(String name, int health) {
        this.name = name;
        this.health = this.maxHealth = health;
        status = "stand";
        number++;
    }

    public BaseHero(String name, int health, int attack, int protection,
                    int shot, int[] damage, int speed) {
        this(name, health);
        this.attack = attack;
        this.defence = protection;
        this.shot = shot;
        this.damage = new Vector2(damage[0], damage[1]);
        this.speed = speed;
    }

    @Override
    public void step(List<BaseHero> side) {
        if (getStatus().equals("Die")) return;
    }

    public String getName() {
        return name;
    }
    protected String getStatus() {
        return status;
    }
    protected void getDamaged(float damagePower) {
        health -= damagePower;
        if (health < 1) {
            status = "Die";
            health = 0;
        }
    }
    @Override
    public String returnCondition() {
        return name +
                " H:" + Math.ceil(health) +
                " D:" + defence +
                " A:" + attack +
                " Dmg:" + (int)(Math.abs((damage.x+damage.y)/2)) +
                (shot>0?" Shots:" + shot:"") + " " +
                status;
    }
}
