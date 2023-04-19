package nx.bootcamp.homework4_2;

public class Shop {
    private Product[] products = {
            new Product("Apple", 50),
            new Product("Banana", 70),
            new Product("Milk", 90),
            new Product("Bread", 40),
            new Product("Cheese", 200),
            new Product("Eggs", 60),
            new Product("Chicken", 150)
    };

    public Product[] getProducts(int cost) {
        /*
        Возвращает массив товаров, цена которых
        не превышает переданное значение.
         */
        int count = 0;
        for (Product product : products) {
            if (product.getPriceInRubles() <= cost) {
                count++;
            }
        }
        Product[] result = new Product[count];
        int index = 0;
        for (Product product : products) {
            if (product.getPriceInRubles() <= cost) {
                result[index] = product;
                index++;
            }
        }
        return result;
    }

    public boolean containsProduct(String name) {
        /*
        Проверяет наличие товара с заданным названием
        */
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Product findTheCheapest() {
        /*
        Находит самый дешевый товар в магазине
        */
        Product cheapest = products[0];
        for (Product product : products) {
            if (product.getPriceInRubles() < cheapest.getPriceInRubles()) {
                cheapest = product;
            }
        }
        return cheapest;
    }
}
