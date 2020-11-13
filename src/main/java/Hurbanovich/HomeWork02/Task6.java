package Hurbanovich.HomeWork02;

public class Task6 {
    // четные от 0 до 100
    public static void main(String[] args) {
        int a = 1;
        for(;a <= 100;a++) {
            int c = a % 2;
            if (c == 0){
                System.out.print(a + ",");
            }

        }


    }
}
