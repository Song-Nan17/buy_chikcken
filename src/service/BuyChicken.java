package service;

import model.Chick;
import model.Hen;
import model.Rooster;

public class BuyChicken {
    public static void chooseChickenStrategy(double money, int number) {
        Rooster rooster = new Rooster();
        Hen hen = new Hen();
        Chick chick = new Chick();
        for (int roosterNumber = 0; roosterNumber <= rooster.computeMaxNumber(money); roosterNumber++) {
            for (int henNumber = 0; henNumber <= hen.computeMaxNumber(money); henNumber++) {
                int chickNumber = number - roosterNumber - henNumber;
                if (roosterNumber * rooster.getprice() + henNumber * hen.getprice() + chickNumber * chick.getprice() == money) {
                    System.out.println(rooster.getType() + ":" + roosterNumber+"\t"
                            + hen.getType() + ":" + henNumber+ "\t"
                            + chick.getType() + ":" + chickNumber);
                }
            }
        }
    }
}
