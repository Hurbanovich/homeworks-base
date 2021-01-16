package HomeWork05;

import java.util.Random;
import java.util.Scanner;

class Computers implements PrintInfo{
    private Protsesors protsesors;
    private Hard hard;
    private Ram ram;
    private int inclusionResource;
    private int faer;

    public Computers() {
        Random ran = new Random();
        this.protsesors = new Protsesors();
        this.hard = new Hard();
        this.ram = new Ram();
        this.inclusionResource = ran.nextInt(5)+1;
    }

    public Protsesors getProtsesors() {
        return protsesors;
    }

    public Hard getHard() {
        return hard;
    }

    public Ram getRam() {
        return ram;
    }

    public int getInclusionResource() {
        return inclusionResource;
    }

    public void setInclusionResource(int inclusionResource) {
        this.inclusionResource = inclusionResource;
    }


    Scanner scan = new Scanner(System.in);
    Random ran = new Random();


    @Override
    public void info(){
        getProtsesors().info();
        getHard().info();
        getRam().info();
        System.out.println("мой ресурс: " + inclusionResource );
    }

    public void on() {
        if(chekInclusionResource()) {
            int inputRandom;
            int inputScanner;
            inputRandom = ran.nextInt(2);
            System.out.println(inputRandom);
            inputScanner = scan.nextInt();
            if (chekOnOff(inputRandom, inputScanner)) {
                System.out.println("Привет! Tы меня включил вот мои параметры:");
                info();
            } else {
                System.out.println("компу хана... кранты... капут... сгорел... эх Помянем");
                inclusionResource = 0;
            }
        }else{
            System.out.println("Нельзя включить сгоревший комп!");
        }
    }

    public void off() {
        inclusionResource--;
        int inputRandom;
        int inputScanner;
        inputRandom = ran.nextInt(2);
        System.out.println(inputRandom);
        inputScanner = scan.nextInt();
        if (chekOnOff(inputRandom, inputScanner)) {
            System.out.println("я OFF");
        }else {
            System.out.println("компу хана... кранты... капут... сгорел... эх Помянем");
            inclusionResource = 0;
        }
    }

    public boolean chekInclusionResource(){
        return inclusionResource != 0;
    }
    public boolean chekOnOff(int a, int b) {
        return a == b;
    }

}

