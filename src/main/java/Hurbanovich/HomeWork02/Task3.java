package Hurbanovich.HomeWork02;

public class Task3 {
    //посчитать 1+2+4+8...256
    public static void main(String[] args) {
        int result=0;
        int a =1;
        while (a<=256){
         a = a * 2;
        result= + a;
        }
        System.out.println(result);
    }
}
