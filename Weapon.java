public class Weapon {
    private String w_name;
    private int w_damage, w_exp, w_level;

    public Weapon(String w_name, int w_damage, int w_exp, int w_level) {
        this.w_name = w_name;
        this.w_damage = w_damage;
        this.w_exp = w_exp;
        this.w_level = w_level;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "w_name='" + getW_name() + '\'' +
                ", w_damage=" + getW_damage() +
                ", w_exp=" + getW_exp() +
                ", w_level=" + getW_level() +
                '}';
    }

    public String getW_name() {
        return w_name;
    }

    public void setW_name(String w_name) {
        this.w_name = w_name;
    }

    public int getW_damage() {
        return w_damage + (w_damage * w_level / 10);
    }

    public void setW_damage(int w_damage) {
        this.w_damage = w_damage;
    }

    public int getW_exp() {
        return w_exp;
    }

    public void setW_exp(int w_exp) {
        this.w_exp = w_exp;
    }

    public int getW_level() {
        return w_level;
    }

    public void setW_level(int w_level) {
        this.w_level = w_level;
    }
}
