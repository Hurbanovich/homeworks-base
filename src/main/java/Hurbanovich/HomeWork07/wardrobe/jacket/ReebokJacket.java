package HomeWork07.wardrobe.jacket;

public class ReebokJacket implements IJacket{
    @Override
    public void toClothe() {
        System.out.println("застегнул куртку Reebok");
    }

    @Override
    public void takeOff() {
        System.out.println("снял куртку Reebok");

    }
}
