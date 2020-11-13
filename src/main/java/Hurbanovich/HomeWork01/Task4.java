package Hurbanovich.HomeWork01;

public class Task4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        int c = 5;
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3");
        } else
            if (a <= 0 && b <= 0 && c > 0) {
                System.out.println("1");
        }else
            if (a <= 0 && b > 0 && c <= 0){
                System.out.println("1");
        }else
            if (a > 0 && b <= 0 && c <= 0){
                System.out.println("1");
        }else
            if (a > 0 && b <= 0 && c > 0) {
                System.out.println("2");
        }else
            if (a <= 0 && b > 0 && c > 0){
                System.out.println("2");
        }else
            if (a > 0 && b > 0 && c <= 0) {System.out.println("2");
        }else System.out.println("0");
    }
}
