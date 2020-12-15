package homeWork10.task;


import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class PerformanceOfTasks {
    public static void taskOne()   throws IOException {
        Path path = Path.of("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\new file task1.txt");
        File file = new File("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\source file task1.txt");
        String word;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            word = scanner.next();
            if(TextFormator.checkPolendrom(word)){
                Files.writeString (path,word,StandardOpenOption.APPEND);
                Files.writeString (path,"\n",StandardOpenOption.APPEND);
            }
        }
    }
    public static void taskTwo()   throws IOException {
        Path path_1 = Path.of("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\source file task2.txt");
        Path path_2 = Path.of("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\new file task2.txt");
        String StringValue = Files.readString(path_1);
        String[] proposal = StringValue.split("[.!?]");
        for (String s : proposal) {
            if (TextFormator.theWordCounter(s) > 2 && TextFormator.theWordCounter(s) < 6 || TextFormator.checkPolendromInString(s)) {
                Files.writeString (path_2,s,StandardOpenOption.APPEND);
                Files.writeString (path_2,"\n",StandardOpenOption.APPEND);
            }
        }
    }
    public static void taskThree() throws IOException {
        Path path_1 = Path.of("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\source file task3.txt");
        Path path_2 = Path.of("D:\\IdeaProjects\\homeworks-base\\src\\main\\java\\Hurbanovich\\homeWork10\\resources\\Black List.txt");
        String stringValue = Files.readString(path_1);
        String valueBlackList = Files.readString(path_2);
        System.out.println(TextFormator.Censorship(stringValue,valueBlackList));
    }
    public static void taskfour(){
        Car ford = new Car();
        ford.setBrasns("Ford");
        ford.setPrice(12000);
        ford.setSpeed(230);
        Serializator.serialization(ford);
        Car car = Serializator.deserialization();
        System.out.println("Марка: "+car.getBrasns()+"\nМаксимальная скорость: "+car.getSpeed()+"\nСтоймость: "+car.getPrice());
    }
}
