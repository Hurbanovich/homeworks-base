package HomeWork07.wardrobe.pants;

public class PumaPants implements IPants{
    @Override
    public void toClothe() {
        System.out.println("одел штаны Puma");

    }

    @Override
    public void takeOff() {
        System.out.println("снял штаны Puma");

    }
}
