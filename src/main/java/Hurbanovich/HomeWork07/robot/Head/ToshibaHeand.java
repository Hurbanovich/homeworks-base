package HomeWork07.robot.Head;

public class ToshibaHeand implements IHead{
    private int praic;

    public ToshibaHeand(int praic) {
        this.praic = praic;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return praic;
    }
}
