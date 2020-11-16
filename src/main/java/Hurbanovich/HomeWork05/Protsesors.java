package HomeWork05;
import java.util.Random;

class Protsesors {
 static Random ran =new Random();
 static void protParamer(){
 String brand;
 double frequency;
  int core;
  int a = ran.nextInt(2);
  int c = ran.nextInt(3);
  int d = ran.nextInt(3);
  String[] massBrand = {"AMD Ryzen","Intel Core i3-8100","Intel Core i5-9400F"};
  double[] massFrequency = {1.8,2.7,3.2,3.6};
  int[] massCore = {16,2,4,8};
  brand = massBrand[a];
  core = massCore[c];
  frequency = massFrequency[d];
  System.out.printf("Процесор: %s\t %d ядер\tТактовая частота: %.1f ГГц \n",brand,core,frequency);
    }
}

