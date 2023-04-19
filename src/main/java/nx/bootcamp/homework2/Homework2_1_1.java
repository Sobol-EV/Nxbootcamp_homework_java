package nx.bootcamp.homework2;

public class Homework2_1_1 {
    static int sum;

    public static void main(String[] args) {
        int ilyaApples = 5;
        askKatya();
        askAnton();
        askDima();
        sum += ilyaApples;
        System.out.println(sum);
    }

    public static void askKatya() {
        int katyaApples = 3;
        sum += katyaApples;
    }

    public static void askAnton() {
        int antonApples = 4;
        sum += antonApples;
    }

    public static void askDima() {
        int dimaApples = 2;
        sum += dimaApples;
    }
}