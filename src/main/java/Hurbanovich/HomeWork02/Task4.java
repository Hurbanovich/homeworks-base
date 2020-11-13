package Hurbanovich.HomeWork02;

public class Task4 {
    //умножение без символа *
    public static void main(String[] args) {
        int a = -3;
        int b = -3;
        int b1=Math.abs(b);
        int c = Math.abs(a);
        int a1=0;
        int i = 1;
            for (i = 1; i <= b1 ; i++) {
                a1 = a1 + c;
            }
        if (a<0 && b<0 || a>0 && b>0 ) {
            System.out.println("ответ: " + a1);
        }else{
            System.out.println("ответ: " + -a1);}

    }
}
