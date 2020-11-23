package HomeWork07.robot.Hands;

public class SamsungHand implements IHand{
    private int praic;

    public SamsungHand(int praic) {
        this.praic = praic;
    }

    @Override
    public void upHand() {
        System.out.println("Поднял руки Samsung");

    }

    @Override
    public int getPrice() {
        return praic;
    }
}
