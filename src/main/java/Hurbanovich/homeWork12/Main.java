package homeWork12;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        VizaCard vizaCard = new VizaCard(500);
        for (int i = 0; i < 5; i++) {
            Thread thread0 = new Thread(new MoneyProducer(vizaCard));
            Thread thread2 = new Thread(new MoneyConsumer(vizaCard));
            thread0.start();
            thread2.start();

        }
        Thread thread = new Thread(new MoneyProducer(vizaCard));
        thread.start();
        thread.join();
        System.out.println("текущий баланс: "+vizaCard.getAccountStatus()+ " дольнейшие операции не могут быть выполнены");

    }
}
