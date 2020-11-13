package Hurbanovich.HomeWork03;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[] mass1 = new int[10];
        int[] mass2 = new int[10];
        double[] mass3 = new double[10];
        Random rad = new Random();
        for (int i = 0; i < 9; i++) {
            mass1[i] = rad.nextInt(9);
            mass2[i] = rad.nextInt(9);
            mass3[i] = (double)mass1[i]/mass2[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(mass1[i] + " ");}
        System.out.println();
        for (int i = 0; i < 10; i++) {
                System.out.print(mass2[i] + " ");}
        System.out.println();
        for (int i = 0; i < 10; i++) {
                    System.out.print(mass3[i] + " ,  ");
        }
        int rezyltat = 0;
        int chisla = 0;
        for (int i=0;i<9;i++){
            chisla = (int)mass3[i];
            if(mass3[i]-chisla==0 && mass3[i] !=0){
                rezyltat= rezyltat+1;
            }
        }
        System.out.println();
        System.out.println("целых чисел в  масиве mass3 = "+rezyltat);
    }
}
