package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        Random ran =new Random();
        int chet=0;
        for(int i = 0;i<15;i++){
            mas[i]= ran.nextInt(99);
            System.out.print(mas[i]+" ");}
        System.out.println();
        System.out.print("Четные числа: ");
        for(int i = 0;i<15;i++){
            if (mas[i]%2==0){
            System.out.print(mas[i]+" ");
            chet++;
            }
        }
        System.out.println();
        System.out.println(chet + " четных чисел");


    }
}
