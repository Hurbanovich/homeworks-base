package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        Random ran =new Random();
        for(int i = 0;i<20;i++){
            mas[i]= ran.nextInt(20);
            System.out.print(mas[i]+" ");}
        System.out.println();
        for(int i = 1;i<20;){
            mas[i] = 0;
            i=i+2;
        }
        for(int i = 0;i<20;i++){
            System.out.print(mas[i]+" ");}
    }
}


