package HomeWork07.robot.Head;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sansung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
