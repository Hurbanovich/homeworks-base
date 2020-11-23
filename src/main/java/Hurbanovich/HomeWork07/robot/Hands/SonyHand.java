package HomeWork07.robot.Hands;

public class SonyHand implements IHand {
    private int price;
    public SonyHand(int price) {
        this.price = price;
    }


    @Override
    public void upHand() {
        System.out.println("Поднял руки Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
