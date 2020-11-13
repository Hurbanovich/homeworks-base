package Hurbanovich.HomeWork01;

public class Task5 {
    public static void main(String[] args) {
        int a = -20;
        int b = 10;
        int c = 6;
        if (a > 0 && b > 0 && c > 0) {
            int y = 3;
            int n = 0;
            System.out.println(y + " положительных, " + n + " отрицательных");
        } else if (a < 0 && b < 0 && c > 0) {
            int y = 1;
            int n = 2;
            System.out.println(y + " положительное, " + n + " отрицательных");
        } else if (a < 0 && b > 0 && c < 0) {
            int y = 1;
            int n = 2;
            System.out.println(y + " положительное, " + n + " отрицательных");
        } else if (a > 0 && b < 0 && c < 0) {
            int y = 1;
            int n = 2;
            System.out.println(y + " положительное, " + n + " отрицательных");
        } else if (a > 0 && b < 0 && c > 0) {
            int y = 2;
            int n = 1;
            System.out.println(y + " положительных, " + n + " отрицательное");
        } else if (a < 0 && b > 0 && c > 0) {
            int y = 2;
            int n = 1;
            System.out.println(y + " положительных, " + n + " отрицательное");
        } else if (a > 0 && b > 0 && c < 0) {
            int y = 2;
            int n = 1;
            System.out.println(y + " положительных, " + n + " отрицательное");
        } else if (a < 0 && b < 0 && c < 0) {
            int y = 0;
            int n = 3;
            System.out.println(y + " положительных, " + n + " отрицательных");
        } else {
            System.out.println("0 вводить нечесно!");

        }


    }}