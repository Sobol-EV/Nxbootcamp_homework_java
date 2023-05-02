package nx.bootcamp.homework7_2;

import nx.bootcamp.homework6_2.ShopException.ProductNotFoundException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Shop {
    private static LinkedList<Product> products;
    private int size;
    public Shop() {
        this.products = new LinkedList<Product>();
    }
    public void addProduct(Product product) {
        products.add(product);
    }
    public void deleteProduct(String name) throws ProductNotFoundException {
        boolean foundElem = false;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                foundElem = true;
                break;
            }
        }
        if (!foundElem) {
            throw new ProductNotFoundException("Product with name " + name + " not found in the shop.");
        }
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

    public <T> ArrayList<Toy> findToys(T age) {
        ArrayList<Toy> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Toy) {
                int toyAge = ((Toy) product).getAgeLimit();
                if ((age instanceof Integer) && (toyAge <= (int) age)) {
                    result.add((Toy) product);
                } else if (age instanceof String) {
                    try {
                        int ageNumber = Integer.parseInt((String) age);
                        if (toyAge <= ageNumber) {
                            result.add((Toy) product);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Cannot convert the passed string to a number.");
                    }
                }
            }
        }
        return result;
    }

    public <T> ArrayList<Food> findFood(T date) {
        ArrayList<Food> result = new ArrayList<>();
        for (Product product : products) {
            if (product instanceof Food) {
                Date foodExpirationDate = ((Food) product).getExpirationDate();
                if ((date instanceof Date) && (foodExpirationDate.after((Date) date))) {
                    result.add((Food) product);
                } else if (date instanceof String) {
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                    try {
                        Date inputDate = format.parse((String) date);
                        if (foodExpirationDate.after(inputDate)) {
                            result.add((Food) product);
                        }
                    } catch (ParseException e) {
                        System.out.println("The passed string cannot be converted to a date.");
                    }
                }
            }
        }
        return result;
    }
}
