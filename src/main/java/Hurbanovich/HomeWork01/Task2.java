package Hurbanovich.HomeWork01;

public class Task2 {
    public static void main(String[] args) {
        int a = 24;
        int b = 1;
        int c = 31;
        if(a>b+c || b>a+c || c>a+b){
            System.out.println("такого треугольника не существует");
        }else{
            System.out.println("такой треугольник может быть");
        }

    }
}
