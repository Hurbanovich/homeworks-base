package HomeWork06;

public class Passenger extends Air implements Info {
    public int quantityOfPassengers;
    public boolean businessClass;

    public Passenger(int power, int maxSpeed, double weight, String brand, double wingspan, double runway, int quantityOfPassengers, boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, runway);
        this.quantityOfPassengers = quantityOfPassengers;
        this.businessClass = businessClass;
    }


    @Override
    public void showInfo() {
        System.out.println();
        System.out.printf("\n Мощьсность двигателя %d л/с\n максимальноя скрорость %d км/ч,\n вес %.1f тонны,\n марка %s, размах крыльем %.1f метра\n" +
                " дистанция рагона для взлета %.1f ,\n количесво мест %d,\n наличие бизнес класса %b \n " +
                "мошьность в киловатах состовляет: %.2f кВ ", power,maxSpeed,weight,brand,wingspan,runway,quantityOfPassengers,businessClass,powKW());
    }
    public void checkquantityOfPassengers(int percon) {
        System.out.println();
        if (percon>quantityOfPassengers){
            System.out.println("вам нужен другой самолет");}
        else System.out.println("Самолет загружен");
    }
}
