package HomeWork07.robot.Legs;

public class ToshibaLeg implements ILeg {
    private int praic;

    public ToshibaLeg(int praic) {
        this.praic = praic;
    }

    @Override
    public void step() {
        System.out.println("Шаг Toshiba");
    }

    @Override
    public int getPrice() {
        return praic;
    }
}
