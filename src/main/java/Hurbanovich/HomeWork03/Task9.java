package Hurbanovich.HomeWork03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner ckanep = new Scanner(System.in);
        Random ran = new Random();
        System.out.println("Введите положительное число");
        if (ckanep.hasNextInt()) {
            int nomer = ckanep.nextInt();
            if (nomer<0){
                System.out.println("Вы ввели отрицательное число");
                return;
            }else if(nomer==0 || nomer<2){
                System.out.println("Используйте цифру больше единицы ");
            return;
            }
            int mass[] = new int[nomer];
            for (int i = 0; i < nomer; i++) {
                mass[i] = ran.nextInt(15);
            }
            System.out.println(" " + Arrays.toString(mass));
            int symma1 = 0;
            int symma2 = 0;
            for (int i = 0; i < nomer / 2; i++) {
                symma1 = symma1 + mass[i];
            }
            for (int i = nomer - 1; i >= nomer / 2; i--) {
                symma2 = symma2 + mass[i];
            }
            if (symma1 > symma2) {
                System.out.println("Сумма левой части больше правой " + symma1 + " > " + symma2);
            } else if (symma2 > symma1) {
                System.out.println("Сумма правой части больше левой " + symma1 + " < " + symma2);
            } else {
                System.out.println("обе половины масива ровны " + symma1 + " = " + symma2);
            }
        }else {
            System.out.println("Вы ввели не число");
        }
        ckanep.close();



    }
}