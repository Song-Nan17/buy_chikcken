package model;

public abstract class Chicken {
    private String type;
    private double price;

    public Chicken(String type, double price) {
        this.type = type;
        this.price = price;
    }
    public abstract double computeMaxNumber(double money);

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getprice() {
        return this.price;
    }

    public void setprice(double price) {
        this.price = price;
    }
}
