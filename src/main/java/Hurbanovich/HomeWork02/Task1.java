package Hurbanovich.HomeWork02;

public class Task1 {
    //задача про дистанцию
    public static void main(String[] args) {
        int day;
        double yesterDayKm = 10.0;
        double htisDayKm;
        double totalKm = 10;
        for (day=1;day<7;day++) {
            htisDayKm = yesterDayKm * 1.1;
            totalKm = totalKm + htisDayKm;
            yesterDayKm = htisDayKm;

        }
        System.out.println(totalKm);
    }
}
