package HomeWork07.wardrobe.jacket;

public class PumaJacket implements IJacket{
    @Override
    public void toClothe() {
        System.out.println("застегнул куртку Puma");
    }

    @Override
    public void takeOff() {
        System.out.println("снял куртку Puma");

    }
}
