package model;

public class Rooster extends Chicken {
    public Rooster() {
        super("公鸡",5);
    }
    @Override
    public double computeMaxNumber(double money) {
        return Math.floor(money/5);
    }
}
