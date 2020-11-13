package Hurbanovich.HomeWork03;

public class Task1 {
    public static void main(String[] args) {
        int[] chetnie = new int[10];
        System.out.println("Значение масива ");
            int s=2;
        for(int a = 0; a<=9;a++){
            chetnie[a]=s;
            s=s+2;
        }
        for(int a=0;a<=9;a++){
            System.out.print(chetnie[a] + ",");
        }
        System.out.println();
        for(int a=0;a<=9;a++) {
            System.out.println(chetnie[a]);
        }


    }
}
