package Hurbanovich.HomeWork01;

public class Task1 {
    public static void main(String[] args) {
        int proverka = 10;
        int mod=Math.abs(proverka);
        double znach =(double) mod/100;
        String mgad;
        String zona;
        if(proverka>0){
            mgad=" положительное ";}
        else if(proverka==0){
            mgad = "";
        }
        else
        { mgad=" отрецателное  ";}

        if(mod<10){
            zona = " однозначное ";
        }else if(znach<1 && znach>0){
            zona = " двухзначное ";
        }else if(znach<10 && znach>=1){
            zona = " трехначное ";
        }else if (znach>=10 && znach<100){
            zona = " четырехзначное ";
        }else if (znach>=100 && znach<1000){
            zona = " пятизначное ";
        }else  {zona = "";


        }
        System.out.println(proverka + mgad + zona + "число" );



    }
}

