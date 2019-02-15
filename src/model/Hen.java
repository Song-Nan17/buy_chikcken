package model;

public class Hen extends Chicken {

    public Hen() {
        super("母鸡",3);
    }

    @Override
    public double computeMaxNumber(double money) {
        return Math.floor(money/3);
    }
}
