package HomeWork07.robot.Legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг Sony");

    }

    @Override
    public int getPrice() {
        return price;
    }
}