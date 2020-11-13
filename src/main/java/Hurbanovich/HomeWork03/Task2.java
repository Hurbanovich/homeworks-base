package Hurbanovich.HomeWork03;

public class Task2 {
    public static void main(String[] args) {
        int[] chetnie = new int[50];
        System.out.println("Значение масива ");
        int s=1;
        for(int a = 0; a<=49;a++){
            chetnie[a]=s;
            s=s+2;
        }
        for(int a=0;a<=49;a++){
            System.out.print(chetnie[a] + ",");
        }
        System.out.println();
        for(int a=49;a>=0;a--) {
            System.out.print(chetnie[a] + ",");
        }
    }
}
