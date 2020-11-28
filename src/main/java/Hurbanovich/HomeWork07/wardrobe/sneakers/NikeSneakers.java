package HomeWork07.wardrobe.sneakers;

public class NikeSneakers implements ISneakers{
    @Override
    public void toClothe() {
        System.out.println("зашнуровал Nike");
    }

    @Override
    public void takeOff() {
        System.out.println("снял Nike");

    }
}
