package HomeWork06;

public class Transport {
    public static int power;//лошодиные силы
    public int maxSpeed;//максимальноя скорость
    public double weight;//масса
    public String brand;//марка


    public Transport(int power, int maxSpeed, double weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public static double powKW (){
        double powerKW = (double) power / 0.75;
    return powerKW;
    }

    public static void main(String[] args) {
        Car ford =new Car(200,220,1500,
                "ford",4,2,4,"passat");
        ford.showInfo();
        Cargo iveka = new Cargo(6000,180,8,"Iveka",10,10,20);
        iveka.showInfo();
        Passenger boeing = new Passenger(22200,955,162.4,"Боинг",59.6,2,660,true);
        boeing.showInfo();
        Military cy =new Military(22200,1950,16.2,"f/A-18",16, 1,20,false);
        cy.showInfo();
        ford.calculation(10);
        boeing.checkquantityOfPassengers(224);
        iveka.checkCarrying(21);
        cy.catapult();
        cy.shot();

    }
}
