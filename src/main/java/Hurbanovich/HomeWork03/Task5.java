package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] mas1 = new int [5];
        int[] mas2 = new int [5];
        double cymaMas1=0;
        double cymaMas2=0;
        Random rad =new Random();
        for(int i=0;i<5;i++){
            mas1[i] = rad.nextInt(15);
            System.out.print(mas1[i] + " ");
            cymaMas1= cymaMas1+ (double) mas1[i];
        }
        System.out.println();
        for(int i = 0;i<5;i++){
            mas2[i] = rad.nextInt(15);
            System.out.print(mas2[i] + " ");
            cymaMas2 = cymaMas2 + (double) mas2[i];
        }
        System.out.println();
        if (cymaMas1/5>cymaMas2/5){
            System.out.println("среднее арифметическое mas1 больше чем среднее арифметическое mas2 " );
        }else if (cymaMas1/5<cymaMas2/5){
            System.out.println("среднее арифметическое mas2 больше чем среднее арифметическое mas1 " );
        }else {
            System.out.println("среднее арифметическое mas1 и среднее арифметическое mas2 равны" );
        }

    }
}
