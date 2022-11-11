package OOP;

import java.util.List;

public abstract class Person implements Interface {
    private int attack;
    private int defence;
    private int arrows;
    private int[] damage;
    protected int health;
    protected int maxHealth;
    private int speed;
    private String name;
    private String inform;
    private boolean status;
    protected List<Person> band;
    private int x;
    private int y;


    protected void setBand(List<Person> band){
        this.band = band;
    }

    public String getInfoAboutPerson() {
        return inform;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefence() {
        return defence;
    }

    public int getArrows() {
        return arrows;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHealth() { return health; }

    public int getSpeed() {
        return speed;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public String getInfo() {
        return "Name: " + name +
                ", attack: " + attack +
                ", defence: " + defence +
                ", damage: " + damage[0] + ".." + damage[1] +
                ", health: " + health +
                ", speed: " + speed;
    }

    public void setArrows(String str, int arrows) {
        if (arrows < 0) {
            this.arrows = 0;
            return;
        }

        if ("sniper".equals(str)) {
            if (arrows > 32) {  // если снайпер и стрел больше 32
                this.arrows = 32;
                return;
            }
        } else {  // если лучник и стрел больше 16
            if (arrows > 16) {
                this.arrows = 16;
                return;
            }
        }

        this.arrows = arrows;
    }

    public Person(String name, int attack, int defence, int[] damage, int  health, int speed, String inform, int x, int y) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = this.maxHealth = health;
        this.speed = speed;
        this.inform = inform;
        status = true;
        this.x = x;
        this.y = y;
    }

    @Override
    public void step() {
        System.out.println(name + " nothing to do");
    }

    @Override
    public void print() {
        System.out.println(getInfo() + "\n" + inform);
    }

    @Override
    public String getName() { return name; }
    
}
