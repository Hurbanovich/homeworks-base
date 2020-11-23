package HomeWork07.robot.Legs;

public class SamsungLeg implements ILeg{
    private int praic;

    public SamsungLeg(int praic) {
        this.praic = praic;
    }

    @Override
    public void step() {
        System.out.println("Шаг Samsung");
    }

    @Override
    public int getPrice() {
        return praic;
    }
}
