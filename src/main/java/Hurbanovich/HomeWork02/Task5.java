package Hurbanovich.HomeWork02;

public class Task5 {
    //дюймы см таблица
    public static void main(String[] args) {
        int a = 1;
        for (; a <= 20; a++) {
            double d = a * 2.54;
            if (a == 1) {
                System.out.println(a + " дюйм = " + d + " См");
            } else if (a > 1 && a < 5) {
                System.out.println(a + " дюймa = " + d + " См");
            } else {
                System.out.println(a + " дюймoв = " + d + " См");
            }


        }

    }
}


