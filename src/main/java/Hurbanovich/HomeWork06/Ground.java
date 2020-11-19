package HomeWork06;

public class Ground extends Transport {
    public int cemmaWheels;// количесво колес
    public int fuelsExpenses;// литров на 100 км

    public Ground(int power, int maxSpeed, double weight, String brand, int cemmaWheels, int fuelsExpenses) {
        super(power, maxSpeed, weight, brand);
        this.cemmaWheels = cemmaWheels;
        this.fuelsExpenses = fuelsExpenses;
    }


}