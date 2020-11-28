package HomeWork07.wardrobe.persons;

import HomeWork07.wardrobe.jacket.IJacket;
import HomeWork07.wardrobe.jacket.NikeJacket;
import HomeWork07.wardrobe.jacket.ReebokJacket;
import HomeWork07.wardrobe.pants.IPants;
import HomeWork07.wardrobe.pants.NikePants;
import HomeWork07.wardrobe.sneakers.ISneakers;
import HomeWork07.wardrobe.sneakers.NikeSneakers;

public class Persons implements IPersons{
    public Persons(IJacket jacket, IPants pants, ISneakers sneakers, String name) {
        this.jacket = jacket;
        this.pants = pants;
        this.sneakers = sneakers;
        this.name = name;
    }
    private ISneakers sneakers;
    private IJacket jacket;
    private IPants pants;
    private String name;


    public String getName() {
        return name;
    }
    public IJacket getJacket() {
        return jacket;
    }
    public IPants getPants() {
        return pants;
    }
    public ISneakers getSneakers() {
        return sneakers;
    }
    @Override
    public void towadrobe() {
        jacket.toClothe();
        pants.toClothe();
        sneakers.toClothe();
    }

    @Override
    public void wadpobeOff() {
        jacket.takeOff();
        pants.takeOff();
        sneakers.takeOff();

    }
}


