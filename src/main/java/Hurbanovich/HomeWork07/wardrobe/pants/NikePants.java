package HomeWork07.wardrobe.pants;

public class NikePants implements IPants{
    @Override
    public void toClothe() {
        System.out.println("одел штаны Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял штаны Nike");

    }
}
