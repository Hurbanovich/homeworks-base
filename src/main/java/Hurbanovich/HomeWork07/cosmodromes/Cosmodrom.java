package HomeWork07.cosmodromes;

public class Cosmodrom {
    public static void main(String[] args) throws InterruptedException {
        Cosmodrom cosmodrom = new Cosmodrom();
        IStart apalon_13 = new Shuttle();
        IStart penguinChack = new PenguinFarm();
        cosmodrom.renning(apalon_13);
        cosmodrom.renning(penguinChack);

    }

    public void renning(IStart renning) throws InterruptedException {
        if (renning.check()) {
            renning.engineStart();
            renning.start();
        }else {
            System.out.println("Проверка двигателя провалена");
        }
    }

}
