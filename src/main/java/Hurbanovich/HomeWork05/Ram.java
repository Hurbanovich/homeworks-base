package HomeWork05;

import java.util.Random;

class Ram implements PrintInfo{
    private final String BRAND;
    private final int TAKT;
    private final int MEMORI;

    public String getBRAND() {
        return BRAND;
    }

    public int getTAKT() {
        return TAKT;
    }

    public int getMEMORI() {
        return MEMORI;
    }

    public Ram() {
        Random ran = new Random();

        int indexforBrand = ran.nextInt(2);
        int indexforTakt = ran.nextInt(3);
        int indexforMemori = ran.nextInt(3);
        String[] massBrand = {"Toshiba","Seadate","Western"};
        int[] massTakt = {1600,1800,2100,1900};
        int[] massMemori = {16,2,4,8};


        this.BRAND = massBrand[indexforBrand];
        this.TAKT = massTakt[indexforTakt];
        this.MEMORI =  massMemori[indexforMemori];

    }

    @Override
    public void info() {
        System.out.printf("Оперативная память: %s\t Тактовая частота %d МГц\tОбъем: %d Гб \n", BRAND,TAKT,MEMORI);
    }
}
