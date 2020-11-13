package Hurbanovich.HomeWork03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner sca= new Scanner(System.in);
        System.out.println("Введите число больше трех");
        if (sca.hasNextInt()){
            int n =sca .nextInt();
            if(n<=3){
                System.out.println("Вы ввели число меньше 3х");
                return;
            }
            int chetn=0;
            int[]mass= new int[n];
            for(int i=0;i<n;i++){
                mass[i]= rand.nextInt(n);
                if(mass[i]%2==0 && mass[i]!=0){
                    chetn++;
                }
            }
            System.out.println(Arrays.toString(mass));
            int schet=0;
            int[] mass2= new int[chetn];
            for(int i =0;i<n;i++){
                if (mass[i]%2==0 && mass[i]!=0){
                    mass2[schet] = mass[i];
                    schet++;
                }
            }
                System.out.println(Arrays.toString(mass2));
        }else
            System.out.println("Вы ввели не число");
        sca.close();
    }

}
