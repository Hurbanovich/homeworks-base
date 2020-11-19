package HomeWork06;

public class Car extends  Ground implements Info {
   public int numberOfPassengers;
   public String todyType;
   public int tame;
   public double distan;



   public Car(int power, int maxSpeed, double weight, String brand, int cemmaWheels, int fuelsExpenses, int numberOfPassengers, String todyType) {
        super(power, maxSpeed, weight, brand, cemmaWheels, fuelsExpenses);
        this.numberOfPassengers = numberOfPassengers;
        this.todyType = todyType;
   }
   @Override
   public void showInfo() {
        System.out.println();
        System.out.printf(" Мощьсность двигателя %d л/с \n максимальноя скрорость %d км/ч\n вес %.1f тонны,\n " +
                "марка %s, колес %d шт.,\n расход топлива %d литров на 100 км.,\n салон на %d пасажира, тип кузова %s\n мошьность" +
                " в киловатах состовляет: %.2f кВ ",power,maxSpeed,weight,brand,cemmaWheels,fuelsExpenses,numberOfPassengers,todyType,powKW());
   }
   private double expenditure(){
       return distan/100* (double)fuelsExpenses;
   }
   public void calculation(int tame) {
        this.tame = tame;
        double distan = (double) maxSpeed * tame;
        this.distan = distan;
       System.out.println();
       System.out.printf("За время %d ч автомобиль %s двигаясь с максимальной скоростью %d  км/ч проедит %.1f км" +
               " и израсходует %.1f литров топлива", tame,brand,maxSpeed,distan,expenditure());
   }

}
