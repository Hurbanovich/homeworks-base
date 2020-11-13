package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[] mas = new int[4];
        Random rand = new Random();
        for(int i=0;i<4;i++){
            mas[i]= rand.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        if (mas[0]<mas[1] && mas[1]<mas[2] && mas[2]<mas[3]) {
            System.out.println("Массив является строго возростающей последовательностью");
        }else {
            System.out.println();
            System.out.println("Массив не является строго возростающей последовательностью");
        }
    }
}
