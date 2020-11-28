package HomeWork07;

import HomeWork07.wardrobe.jacket.IJacket;
import HomeWork07.wardrobe.jacket.NikeJacket;
import HomeWork07.wardrobe.jacket.PumaJacket;
import HomeWork07.wardrobe.jacket.ReebokJacket;
import HomeWork07.wardrobe.pants.IPants;
import HomeWork07.wardrobe.pants.NikePants;
import HomeWork07.wardrobe.pants.PumaPants;
import HomeWork07.wardrobe.pants.ReebokPants;
import HomeWork07.wardrobe.persons.IPersons;
import HomeWork07.wardrobe.persons.Persons;
import HomeWork07.wardrobe.sneakers.ISneakers;
import HomeWork07.wardrobe.sneakers.NikeSneakers;
import HomeWork07.wardrobe.sneakers.PumaSneakers;
import HomeWork07.wardrobe.sneakers.ReebokSneakers;

public class Main {
    public static void main(String[] args) {
        IJacket nikeJacket=new NikeJacket();
        IJacket pumaJacket=new PumaJacket();
        IJacket reebokJacket=new ReebokJacket();
        IPants nikePants=new NikePants();
        IPants pumaPants=new PumaPants();
        IPants reebokPants=new ReebokPants();
        ISneakers nikeSneakers =new NikeSneakers();
        ISneakers pumaSneakers =new PumaSneakers();
        ISneakers reebokSneakers =new ReebokSneakers();
        Persons man = new Persons(nikeJacket, pumaPants, reebokSneakers,"Dima");
        man.towadrobe();
        man.wadpobeOff();

    }
}
