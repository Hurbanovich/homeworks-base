package Hurbanovich.HomeWork01;

public class Task7 {
    public static void main(String[] args) {
        int a = 1031;
        int b = a % 10;
        int c = a % 100;
        if(c>=11 && c<15){
            System.out.println(a + " програмистов");
        }else if(b==1 || a==1){
            System.out.println(a + " програмист");
        }else if(b>1 && b<5){
            System.out.println(a + " програмиста");
        }else {
            System.out.println(a + " програмистов");
        }
    }
}
