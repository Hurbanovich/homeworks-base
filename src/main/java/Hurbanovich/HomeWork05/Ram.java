package HomeWork05;

import java.util.Random;

class Ram {
   static Random ran =new Random();
   static void ramParametr() {
       String brand;
       int takt;
       int memori;
       int a = ran.nextInt(2);
       int c = ran.nextInt(3);
       int d = ran.nextInt(3);
       String[] massBrand = {"Toshiba","Seadate","Western"};
       int[] massTakt = {1600,1800,2100,1900};
       int[] massMemori = {16,2,4,8};
       brand = massBrand[a];
       takt = massTakt[c];
       memori = massMemori[d];
       System.out.printf("Оперативная память: %s\t Тактовая частота %d МГц\tОбъем: %d Гб \n", brand,takt,memori);
   }
}
