package HomeWork05;
import java.util.Random;

class Protsesors implements PrintInfo{
 private final String BRAND;
 private final double FREQUENCY;
 private final int CORE;

 public String getBRAND() {
  return BRAND;
 }

 public double getFREQUENCY() {
  return FREQUENCY;
 }

 public int getCORE() {
  return CORE;
 }

 public Protsesors() {
  Random ran =new Random();
  int indexforBrand = ran.nextInt(2);
  int indexforFrequency = ran.nextInt(3);
  int indexforCore = ran.nextInt(3);
  String[] massBrand = {"AMD Ryzen","Intel Core i3-8100","Intel Core i5-9400F"};
  double[] massFrequency = {1.8,2.7,3.2,3.6};
  int[] massCore = {16,2,4,8};
  this.BRAND =  massBrand[indexforBrand];
  this.FREQUENCY = massFrequency[indexforFrequency];
  this.CORE = massCore[indexforCore];
 }

 @Override
 public void info() {
  System.out.printf("Процесор: %s\t %d ядер\tТактовая частота: %.1f ГГц \n",BRAND,CORE,FREQUENCY);
 }
}

