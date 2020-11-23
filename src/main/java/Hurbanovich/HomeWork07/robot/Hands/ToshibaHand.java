package HomeWork07.robot.Hands;

public class ToshibaHand implements IHand{
    private int praic;

    public ToshibaHand(int praic) {
        this.praic = praic;
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руки Toshiba");

    }

    @Override
    public int getPrice() {
        return praic;
    }
}
