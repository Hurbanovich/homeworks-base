package Hurbanovich.HomeWork04;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random pan = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите положительное число" );
        if(scan.hasNextInt()){
            int n=scan.nextInt();
            if(n<2){
                System.out.println("Ведите число больше 1");
                return;
            }
            int[][] massiv = new int[n][n];
            int j = 0;
            for(int i=0;i<n;++i) {
                for (j = 0; j < n; j++) {
                    massiv[i][j] = pan.nextInt(50);
                }
            }
            for (int i = 0; i < massiv.length; i++) {
                for (j = 0; j < massiv[i].length; j++) {
                    System.out.print(massiv[i][j] + "\t");
                }
                System.out.println();
            }
                System.out.println("Нечетные элементы находящиеся под главной\n" +
                        "диагональю(включительно):");
            for (int i = 0; i < massiv.length; i++) {
                for (j = 0; j < massiv[i].length; j++) {
                    if (i>=j && massiv[i][j]%2==1) {
                        System.out.print(massiv[i][j] + "\t" );
                    }
                }
            }
        }else {
            System.out.println("Вы ввели не число");
        }
    }
}
