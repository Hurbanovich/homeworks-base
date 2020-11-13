package Hurbanovich.HomeWork04;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
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
            int cmena=0;
            int cmena2=0;

            for(j=0;j<n;j++){
                for (int i=j;i<n;i++) {
                    cmena = massiv[i][j];
                    cmena2= massiv[j][i];
                    massiv[j][i] = cmena;
                    massiv[i][j] = cmena2;
                }
            }
            System.out.println();
            for (int i = 0; i < massiv.length; i++) {
                System.out.println();
                for (j = 0; j < massiv[i].length; j++) {
                    System.out.print(massiv[i][j] + "\t");
                }
            }
        }else {
            System.out.println("Вы ввели не число");
        }
    }
}
