package KrestikiNoliki;

import java.util.Random;
import java.util.Scanner;

class Games {
    final char HODU = '+';
    final char HODC = 'o';
    final char PYSTO = '_';
    char[][] pole;
    Random rand;
    Scanner scan;


    Games(){
        rand = new Random();
        scan = new Scanner(System.in);
        pole = new char[3][3];
    }
    void igrovoePole(){
        for (int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                pole[i][j] = PYSTO;
            }
        }
    }


    void game(){
        igrovoePole();
        prosmotorPolai();
        while (true){
            userHod();
            if(finihs(HODU)){
                System.out.println("Победа!!!");
                break;
            }
            if (proverkaPolia()){
                System.out.println("Дружба, мир, жвачка!!");
                break;
            }
            cmpHod();
            prosmotorPolai();
            if(finihs(HODC)){
                System.out.println();
                System.out.println("O-o-o... иди на кошках тренируйся... комп выйграл");
                break;
            }
            if (proverkaPolia()){
                System.out.println("Дружба, мир, жвачка!!");
                break;
            }

        }
        prosmotorPolai();

    }
    void userHod(){
        int a;
        int b;
        do{
            //for (int i = 0;i<3;i++){
               // System.out.println();
               // for(int j = 0;j<3;j++){
                   // System.out.print(pole[i][j] + "\t");
                //}
            //}
                System.out.println();
            a = scan.nextInt()-1;
            b = scan.nextInt()-1;
        }while (!proverkaCvobodnogoIndekca(a,b));
        pole[a][b] = HODU;
    }
    void prosmotorPolai(){
        for (int i = 0;i<3;i++){
            System.out.println();
            for(int j = 0;j<3;j++){
                System.out.print(pole[i][j] + "\t");
            }
        }
    }
    void cmpHod(){
        int a;
        int b;
        do{

            a = rand.nextInt(3);
            b = rand.nextInt(3);
        }while (!proverkaCvobodnogoIndekca(a,b));
        pole[a][b] = HODC;
    }
    boolean proverkaCvobodnogoIndekca(int a, int b){
            if (a<0||b<0||a>=3||b>=3) //проверка на правильность ведение
                return false;
            return pole[a][b] == PYSTO; //проверка сводность поле
    }
    boolean proverkaPolia(){
        for (int i = 0;i<3;i++)
            for(int j = 0;j<3;j++){
                if(pole[i][j]== PYSTO )
                    return false;}
            return true;
    }
    boolean finihs(char pro){
        for (int i = 0; i < 3; i++)
            if ((pole[i][0] == pro && pole[i][1] == pro && pole[i][2] == pro) ||
                    (pole[0][i] == pro && pole[1][i] == pro && pole[2][i] == pro))
                return true;
            if ((pole[0][0] == pro && pole[1][1] == pro && pole[2][2] == pro) ||
                (pole[2][0] == pro && pole[1][1] == pro && pole[0][2] == pro))
            return true;
        return false;

    }


}


