package homeWork11;


import java.util.*;

public class Shop {
    private Set<Product> shop = new TreeSet<>();


    public void setShop(Set<Product> shop) {
        this.shop = shop;
    }

    /**
     * edits the product list (редактирует список товара)
     * @param newProduct accepts a new or modified product (принимает новый или измененный товар)
     *                   Checks by ID if a product with this ID already exists, then replaces it with
     *                   the current one, otherwise adds it to the list (Проверяет по айди если товар с
     *                   таким айди уже существует то заменяет его на текущий, иначе добавляет в список)
     */
    public void ToEditAProduct(Product newProduct)
    {
        if (checId(newProduct.getId()))
        {
            shop.remove(receivesTheProductById(newProduct.getId()));
            shop.add(newProduct);
        }else
            {
                shop.add(newProduct);
            }

    }

    /**
     * returns the product (возвращает товар)
     * @param id id of the product to be received (айди товара который надо получить)
     * @return returns a product with an identical id if there is no product with the same id returns null
     * (возвращает товар с идентичным айди если товара с таким айди нет возвращает null)
     */
    public Product receivesTheProductById(int id)
    {
        Product result = null;
        if (checId(id)){
            for (Product index: shop)
            {
               if (index.getId()==id){
                   result=index;
               }
            }
        }
        return result;
    }


    /**
     * Deletes the product from list (удаляет товар из списка)
     * @param id id of the product to delete (айди товара который надо удалить)
     */
    public void removProductById(int id)
    {
        shop.removeIf(index -> index.getId() == id);
    }

    /**
     *
     * @return list Product
     */
    public Set<Product> getListProduct()
    {
        return shop;
    }

    /**
     * adds a product to the list of products if there is no product with this ID in the list
     * (добавляет товар в список товаров если в списке нет товара с таким айди)
     * @param product instance product class
     */
    public void addProduct (Product product)
    {
        if(checId(product.getId()))
        {
            System.out.println("Товар с таким id уже есть в списке");
        }else
            {
                shop.add(product);
            }
    }

    /**
     * checks the list of products for the presence of an element by id (проверяет список товаров на наличие элемента по айди)
     * @param id a variable of type int. ID of the product (переменная типа int. айди продукта )
     * @return returns true if the list of products already has a product with the same ID otherwise returns false
     * (возвращает true если в списке товаров уже есть товар с таким айди иначе возвращает false)
     */
    public boolean checId(int id)
    {
        boolean resart = false;
        for (Product index: shop)
        {
            if(index.getId()==id)
            {
                resart= true;
                break;
            }
        }
        return resart;
    }

    public void pintProduct()
    {
        for (Product product: shop)
        {
            System.out.println(product);
        }
    }
    public void pintProduct(Set<Product> sortTyre)
    {
        for (Product product: sortTyre)
        {
            System.out.println(product);
        }
    }


    /**
     * sorting products by price from the lowest (сортирует список товаров по цене от меньшей к большей)
     * выводит отсартированный список в консоль
     */
    public void sortingProductsByPriceFromTheLowest()
    {
       shop.stream().sorted((s1, s2) -> s1.getPraice() - s2.getPraice()).forEach(System.out::println);


    }

    /**
     * sorting products by price from the highest (сортирует список товаров по цене от большей к меньшей)
     * выводит отсартированный список в консоль
     */
    public void sortingProductsByPriceFromTheHighest()
    {
       shop.stream().sorted((s1, s2) -> s2.getPraice() - s1.getPraice()).forEach(System.out::println);


    }
    public void sortItemsInTheOrderTheyWereAdded()
    {
        shop.stream().sorted((s1, s2) -> s2.getQUEUENUBER() - s1.getQUEUENUBER()).forEach(System.out::println);


    }



}

