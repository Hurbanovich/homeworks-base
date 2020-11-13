package Hurbanovich.HomeWork04;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
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
            int proivedeniePoboch=1;
            int proizvedenieGlav=1;
            for (int i = 0; i < massiv.length; i++) {
                for (j = 0; j < massiv[i].length; j++) {
                    if (i==j && massiv[i][j]!=0) {
                        proizvedenieGlav = proizvedenieGlav * massiv[i][j];
                    }
                }
            }
            for(int i=n-1; i>=0; i--){
                for(j=n-1-i; j<n; j++ ){
                    if(massiv[i][j]!=0)
                    proivedeniePoboch = proivedeniePoboch  * massiv[i][j];
                    break;
                }
            }
            if(proizvedenieGlav>proivedeniePoboch){
                System.out.println("Произведение главной диагонали "+proizvedenieGlav+" больше произведения побочной диагонали "+proivedeniePoboch);
            }else if (proivedeniePoboch>proizvedenieGlav){
                System.out.println("Произведение побочной диагонали "+ proivedeniePoboch +" больше произведения  диагонали "+proizvedenieGlav);
            }else {
                System.out.println("Произведение диоганалей ровны " + proivedeniePoboch + " " + proizvedenieGlav);
            }
        }else {
            System.out.println("Вы ввели не число");
        }
    }
}
