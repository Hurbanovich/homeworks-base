package HomeWork06;

public class Air extends Transport {
    public double wingspan;
    public double runway;

    public Air(int power, int maxSpeed, double weight, String brand, double wingspan, double runway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.runway = runway;
    }



}
