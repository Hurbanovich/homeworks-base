package homeWork10.task;

import java.io.Serializable;

public class Car implements Serializable {
    private String brasns;
    private int    speed;
    private int    price;

    public void   setBrasns(String brasns){this.brasns = brasns;}
    public void   setSpeed(int speed){this.speed = speed;}
    public void   setPrice(int price){this.price = price;}
    public int    getPrice(){return price;}
    public int    getSpeed(){return speed;}
    public String getBrasns(){return brasns;}
}
