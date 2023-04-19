package nx.bootcamp.homework2;

public class Homework2_2 {
    private static int watermelonCount = 50;
    private static int melonCount = 70;
    private static double watermelonPrice = 1.5;
    private static double melonPrice = 2.0;

    private Homework2_2 () {}

    public static void sellWatermelons(int count) {
        if (count <= watermelonCount) {
            watermelonCount -= count;
            System.out.println("Sold " + count + " watermelons");
        } else {
            System.out.println("Not enough watermelons in stock");
        }
    }

    public static void sellMelons(int count) {
        if (count <= melonCount) {
            melonCount -= count;
            System.out.println("Sold " + count + " melons.");
        } else {
            System.out.println("Not enough melons in stock.");
        }
    }

    public static void sellFruits(int watermelonCount, int melonCount) {
        sellWatermelons(watermelonCount);
        sellMelons(melonCount);
    }

    public static void setWatermelonPrice(double price) {
        watermelonPrice = price;
        System.out.println("Watermelon price changed to " + price + " rubles.");
    }

    public static void setMelonPrice(double price) {
        melonPrice = price;
        System.out.println("Melon price changed to " + price + " rubles.");
    }

    public static int getFruitCount() {
        int totalFruitCount = watermelonCount + melonCount;
        System.out.println("Total number of fruits in stock: " + totalFruitCount);
        return totalFruitCount;
    }

    public static double calculatePrice(int watermelonCount, int melonCount) {
        double totalPrice = watermelonCount * watermelonPrice + melonCount * melonPrice;
        System.out.println("The price of " + watermelonCount + " watermelons and " + melonCount + " melons is " + totalPrice + " rubles.");
        return totalPrice;
    }
}
