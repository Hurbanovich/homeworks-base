package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] mass = new int[12];
        Random ran = new Random();
        int max = 0; int ind = 0;
        for(int i= 0;i<12;i++){
            mass[i] = ran.nextInt(15);
            System.out.print(mass[i] + " ");
            if(max<mass[i]){
                ind = i;
                max = mass[i];
                
            }
        }
        System.out.println();
        System.out.println("Максимальное значение масива " + max + " в " + ind + " индексе");

    }
}
