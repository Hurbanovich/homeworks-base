package HomeWork05;

import java.util.Random;
import java.util.Scanner;

import static HomeWork05.Task.faerr;

class Computers {
    Scanner scan = new Scanner(System.in);
    Random ran = new Random();
    int schet;
    int faer;
    void schet() {
       int chet=ran.nextInt(5)+1;
        this.schet = chet;
    }
    void fae(){
        faer= faer+1; }

    void work() {

        do {
            if ((!proverkaFaer(faer))) { System.out.println("нельзя включить сгоревший комп");break;}
            fae();
            schet();
            for (; true; ) {
             if (!proverkaSchet(schet)) {
               System.out.println("компу хана... кранты... капут... сгорел... эх Помянем");
               break;
           }
             on();
             if (!proverkaSchet(schet)) {
                 System.out.println("компу хана... кранты... капут... сгорел... эх Помянем");
                 break;
           }
           compInfo();
           off();
           if (!proverkaSchet(schet)) {
               System.out.println("компу хана... кранты... капут... сгорел... эх Помянем");
               break;
           }
         }break;
       }while (proverkaFaer(faer));
   }
    void compInfo(){
        Hard.hardParametr();
        Ram.ramParametr();
        Protsesors.protParamer();
        System.out.println("мой ресурс: " + schet );
    }
   boolean proverkaOnOff(int a, int b) {
       if (a == b)
           return true;
       return false;
   }
   Boolean proverkaSchet(int schet){
       if (schet >0)
           return true;
       return false;
   }
    Boolean proverkaFaer(int faer){
        if (faer <=0)
            return true;
        return false;
    }
    void on() {
        int a;
        int b;
        a = ran.nextInt(2);
        System.out.println(a);
        b = scan.nextInt();
        if (proverkaOnOff(a, b)) {
            System.out.println("Привет! Tы меня включил вот мои параметры:");
        }else { schet = 0; return; }
    }

    void off() {
        schet--;
        int a;
        int b;
        a = ran.nextInt(1);
        System.out.println(a);
        b = scan.nextInt();
        if (proverkaOnOff(a, b)) {
            System.out.println("я OFF");
        }else { schet = 0;return; }
    }

}

