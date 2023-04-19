package nx.bootcamp.homework5_2;

import java.util.ArrayList;
import java.util.Date;
public class Shop {
    private static ArrayList<Product> products = new ArrayList<>();

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static ArrayList<Phone> findPhones(String maker) {
        ArrayList<Phone> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Phone &&
                    ((Phone) product).getMaker().equals(maker)) {
                result.add((Phone) product);
            }
        }
        return result;
    }

    public static ArrayList<Toy> findToys(int age) {
        ArrayList<Toy> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Toy &&
                    ((Toy) product).getAgeLimit() <= age) {
                result.add((Toy) product);
            }
        }
        return result;
    }

    public static ArrayList<Food> findFood(Date date) {
        ArrayList<Food> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Food &&
                    ((Food) product).getExpirationDate().after(date)) {
                result.add((Food) product);
            }
        }
        return result;
    }
}
