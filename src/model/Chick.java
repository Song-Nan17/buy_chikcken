package model;

public class Chick extends Chicken {

    public Chick() {
        super("小鸡", 1.0 / 3);
    }

    public double computeMaxNumber(double money) {
        return Math.floor(money * 3);
    }
}
