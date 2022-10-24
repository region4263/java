package OOP;

public abstract class Person {
    private int attack;
    private int defence;
    private int arrows;
    private int[] damage;
    private int health;
    private int speed;
    private String name;


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

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
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

    public Person(String name, int attack, int defence, int[] damage, int  health, int speed) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
    }

    public String getInfo() {
        return "Name: " + name +
                ", attack: " + attack +
                ", defence: " + defence +
                ", damage: " + damage[0] + ".." + damage[1] +
                ", health: " + health +
                ", speed: " + speed;
    }
}
