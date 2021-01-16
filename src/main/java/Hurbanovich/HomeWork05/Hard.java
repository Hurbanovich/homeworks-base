package HomeWork05;

import java.util.Random;

class Hard implements PrintInfo{
    private final String BRAND;
    private final String SERIES;
    private final int SPEED;
    private final int SIZE;

    public String getBRAND() {
        return BRAND;
    }

    public String getSERIES() {
        return SERIES;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getSIZE() {
        return SIZE;
    }

    public Hard() {
        Random ran = new Random();
        int indexForBrand = ran.nextInt(2);
        int indexForSeries = ran.nextInt(2);
        int indexForSpeed = ran.nextInt(3);
        int indexForSize = ran.nextInt(3);
        String[] massBrand = {"Toshiba", "Seadate", "Western"};
        String[] massSeries = {"ST1200MM0129", "DT01ABA300V", "WD40EZPZ"};
        int[] massSpeed = {5200, 4800, 6000, 3200};
        int[] massSize = {1, 2, 4, 8};

        this.BRAND = massBrand[indexForBrand];;
        this.SERIES = massSeries[indexForSeries];;
        this.SPEED = massSpeed[indexForSpeed];
        this.SIZE = massSize[indexForSize];


    }

    @Override
    public void info() {
        System.out.printf("Жосткий диск: %s\tсерии: %s\tскорость вращения" +
                " шпинделя: %d об/мин\tемкость: %d Tb \n", BRAND, SERIES, SPEED, SIZE);
    }
}