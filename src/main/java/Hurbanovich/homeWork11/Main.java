package homeWork11;

public class Main {
    public static void main(String[] args) {


        Shop shop = new Shop();
        shop.addProduct( new Product("Potato",1,5));
        shop.addProduct(new Product("Bike",5,4000));
        shop.addProduct(new Product("Computer",2,2000));
        shop.addProduct(new Product("iron",4,80));
        shop.addProduct(new Product("Phone",3,550));
        shop.addProduct(new Product("Phone",5,550));

        shop.pintProduct();
        shop.sortingProductsByPriceFromTheLowest();
        shop.sortingProductsByPriceFromTheHighest();


        shop.removProductById(4);
        shop.removProductById(8);
        shop.addProduct(new Product("solar clear",4,50));

        System.out.println(shop.receivesTheProductById(4));
        shop.ToEditAProduct(new Product("iron",4,80));
        System.out.println(shop.receivesTheProductById(4));
        shop.sortItemsInTheOrderTheyWereAdded();
    }
}







