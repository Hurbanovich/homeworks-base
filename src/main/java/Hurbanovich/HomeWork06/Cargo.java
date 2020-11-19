package HomeWork06;

public class Cargo extends Ground implements Info {
    public double carrying;

    public Cargo(int power, int maxSpeed, int weight, String brand, int cemmaWheels, int fuelsExpenses, double carrying) {
        super(power, maxSpeed, weight, brand, cemmaWheels, fuelsExpenses);
        this.carrying = carrying;
    }

    @Override
    public void showInfo() {
        System.out.println();
        System.out.printf("\n Мощьсность двигателя %d л/с\n максимальноя скрорость %d км/ч,\n вес %.1f тонны,\n марка %s, колес %d штук,\n" +
                " расход топлива %d литров на 100 км.,\n грузоподъемность %.1f тонны,\n мошьность в киловатах состовляет: %.2f кВ ",
                power,maxSpeed,weight,brand,cemmaWheels,fuelsExpenses,carrying,powKW());
    }

    public void checkCarrying(double massa) {
        System.out.println();
       if (massa>carrying){
           System.out.println("вам нужен другой грузавик");}
       else System.out.println("Грузавик загружен");
       }
}
