package Hurbanovich.HomeWork02;

public class Task8 {
    // рисунок
    public static void main(String[] args) {
            int a;
            int b;
            for (a=0;a<4;a++){
                for (b=a;b<4;b++){
                    System.out.print("*");
                }
                System.out.println();
            }
        for (a=0;a<=4;a++){
            for (b=a;b>0;b--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
