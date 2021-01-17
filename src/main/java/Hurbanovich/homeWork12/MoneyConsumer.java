package homeWork12;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Random;

public class MoneyConsumer extends ATM{
    private final VizaCard vizaCard;

    public MoneyConsumer(VizaCard vizaCard) {
        this.vizaCard = vizaCard;
    }

    Random random = new Random();
    @Override
    public void run() {
        synchronized (vizaCard) {
            while (vizaCard.getAccountStatus() >= 0 && vizaCard.getAccountStatus() <= 1000) {
                vizaCard.setCounter(vizaCard.getCounter()+1);
                int result = depositAmount();
                System.out.println("Сo счета списано: " + result + " рублей");
                vizaCard.setAccountStatus(vizaCard.getAccountStatus() - result);
                System.out.println("Текущий счет состовляет: " + vizaCard.getAccountStatus() + " рублей");
                System.out.println(vizaCard.getCounter());
                try {
                    vizaCard.wait(shortSleep());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public int depositAmount(){
        return random.nextInt(5) + 5;
    }

    public int shortSleep(){
        return random.nextInt(3000)+2000;
    }
}
