public class Character {
    private String c_name;
    private int hp, mp, c_damage, c_exp, c_level;
    private Weapon wp;

    public Character(String c_name, int hp, int mp, int c_damage, int c_exp, int c_level, Weapon wp) {
        this.c_name = c_name;
        this.hp = hp;
        this.mp = mp;
        this.c_damage = c_damage;
        this.c_exp = c_exp;
        this.c_level = c_level;
        this.wp = wp;
    }

    @Override
    public String toString() {
        return "Character{" +
                "c_name='" + getC_name() + '\'' +
                ", hp=" + getHp() +
                ", mp=" + getMp() +
                ", c_damage=" + getC_damage() +
                ", c_exp=" + getC_exp() +
                ", c_level=" + getC_level() +
                ", wp=" + getWp() +
                '}';
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getC_damage() {
        return c_damage + (c_damage * c_level / 10);
    }

    public void setC_damage(int c_damage) {
        this.c_damage = c_damage;
    }

    public int getC_exp() {
        return c_exp;
    }

    public void setC_exp(int c_exp) {
        this.c_exp = c_exp;
    }

    public int getC_level() {
        return c_level;
    }

    public void setC_level(int c_level) {
        this.c_level = c_level;
    }

    public Weapon getWp() {
        return wp;
    }

    public void setWp(Weapon wp) {
        this.wp = wp;
    }
}
