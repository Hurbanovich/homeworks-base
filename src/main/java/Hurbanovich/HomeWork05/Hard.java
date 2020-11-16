package HomeWork05;

import java.util.Random;

class Hard {
    static Random ran = new Random();
    static void hardParametr() {
        String brand;
        String series;
        int speed;
        int size;
        int a = ran.nextInt(2);
        int b = ran.nextInt(2);
        int c = ran.nextInt(3);
        int d = ran.nextInt(3);
        String[] massBrand = {"Toshiba", "Seadate", "Western"};
        String[] massSeries = {"ST1200MM0129", "DT01ABA300V", "WD40EZPZ"};
        int[] massSpeed = {5200, 4800, 6000, 3200};
        int[] massSize = {1, 2, 4, 8};
        brand = massBrand[a];
        series = massSeries[b];
        speed = massSpeed[c];
        size = massSize[d];
        System.out.printf("Жосткий диск: %s\tсерии: %s\tскорость вращения" +
                " шпинделя: %d об/мин\tемкость: %d Tb \n", brand, series, speed, size);
    }
}