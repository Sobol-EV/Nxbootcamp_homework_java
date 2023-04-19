package nx.bootcamp.homework1;

public class Homework1_1 {
    public static void main(String[] args) {
        String name = "John Smith";
        double start_money = 10000;
        int years = 3;
        double rate = 3.5;

        double finish_money = start_money * Math.pow(1 + rate/100, years);

        System.out.println("Hello, " + name + ". Your final balance: " + finish_money + " rubles.");
    }
}