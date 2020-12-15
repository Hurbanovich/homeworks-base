package homeWork09;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Car transin = new Car(5000,200,"Ford");
        Car passat = new Car(3000,200,"BMW");
        Car korch = new Car(5000,200,"LADA");
        korch.start();
        passat.start();
        transin.start();
    }
}
