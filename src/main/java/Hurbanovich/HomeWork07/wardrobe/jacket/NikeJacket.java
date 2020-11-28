package HomeWork07.wardrobe.jacket;

public class NikeJacket implements IJacket{
    @Override
    public void toClothe() {
        System.out.println("застегнул куртку Nike");

    }

    @Override
    public void takeOff() {
        System.out.println("снял куртку Nike");

    }
}
