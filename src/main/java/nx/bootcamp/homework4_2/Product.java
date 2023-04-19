package nx.bootcamp.homework4_2;

public class Product { // Товар в магазине
    private String name;
    private int priceInRubles;

    public Product(String name, int priceInRubles) {
        this.name = name; // Наименование
        this.priceInRubles = priceInRubles; // Цена
    }

    public String getName() { // Получить наименование
        return name;
    }

    public int getPriceInRubles() { // Получить цену
        return priceInRubles;
    }
}
