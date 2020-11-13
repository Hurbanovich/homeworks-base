package Hurbanovich.HomeWork02;

public class Task7 {
    //все не четные до 100
    public static void main(String[] args) {
        int a = 1;
        for(;a <= 100;a++) {
            int c = a % 2;
            if (c == 1){
                System.out.print(a + ",");
            }

        }


    }
}
