package homeWork09;

import java.util.Random;

public class Car {
    private int praice;
    private int maxSpeed;
    private String brand;

    public Car(int praice, int maxSpeed, String brand) {
        this.praice = praice;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }
    public int getPraice() {
        return praice;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getBrand() {
        return brand;
    }

    public boolean ceck() throws InterruptedException {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(20);
            if (x % 2 == 0) {
                try {
                    throw new MyException("четное число");
                } catch (MyException e) {
                    System.out.printf("Машина %s не завелась, выпало число %d \n",brand, x);
                    System.out.println("Через 3 секунды пробую сново");
                    long time = 3;
                    for (int i = (int) time; i > 0; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                }
                continue;
            }
            return true;
        }
    }
    public void start() throws InterruptedException {
        if(ceck()){
            System.out.println();
            System.out.printf("Машина марки %s завелась",brand);
            System.out.println();
        }
    }
}
