package HomeWork06;

public class Military extends Air implements Info {
    public int rockets;
    boolean catapults;

    public Military(int power, int maxSpeed, double weight, String brand, int wingspan, double runway, int rockets, boolean catapults) {
        super(power, maxSpeed, weight, brand, wingspan, runway);
        this.rockets = rockets;
        this.catapults = catapults;
    }

    @Override
    public void showInfo() {
        System.out.println();
        System.out.printf("\n Мощьсность двигателя %d л/с\n максимальноя скрорость %d км/ч,\n вес %.1f тонны,\n марка %s, размах крыльем %.1f метра\n" +
                        " дистанция рагона для взлета %.1f ,\n количество ракет на борту %d \n наличие катапульты %b \n" +
                        " мошьность в киловатах состовляет: %.2f кВ ", power,maxSpeed,weight,brand,wingspan,runway,rockets,catapults,powKW());
    }
    public void shot() {
        System.out.println();
        if (rockets<=0)
            System.out.println("боеприпасы отсуствуют");
        else System.out.println("ракета пошла...");
    }
    public void catapult() {
        System.out.println();
        if (catapults){
            System.out.println("Катапультирование прошло успешно");}
        else System.out.println("у вас нет такой системы");
    }
}
