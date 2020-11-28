package HomeWork07.cosmodromes;

import java.util.Random;

public class PenguinFarm implements IStart {
    @Override
    public boolean check() {
        Random rand = new Random();
        int b= rand.nextInt(10);
        System.out.println(b);
        if (b != 3){return true;}
        else {return false;}
    }

    @Override
    public void engineStart() {
        System.out.println("Клюв начищен крылья расправлены. Пингвин к полету готов");

    }

    @Override
    public void start() throws InterruptedException {
        long time = 10;
        for (int i = (int) time; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Старт");
        System.out.println("При помощи пендо-косательного ускарения," +
                " пингвин достиг скорость вращающегося косинуса перомиодального интеграла" +
                "  и  покин орбиту земли");

    }
}