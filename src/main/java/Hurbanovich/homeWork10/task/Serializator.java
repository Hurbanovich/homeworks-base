package homeWork10.task;

import java.io.*;

public class Serializator {
    public static void serialization(Car car){
        ObjectOutputStream oos=null;
        File file = new File("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\file task4.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(oos!=null){
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }
        }
    }
    public static Car deserialization(){
        ObjectInputStream ois=null;
        Car car = null;
        File file = new File("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\file task4.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            car = (Car)ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }return car;
    }
}
