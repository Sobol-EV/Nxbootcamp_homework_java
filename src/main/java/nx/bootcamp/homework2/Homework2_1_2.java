package nx.bootcamp.homework2;

public class Homework2_1_2 {

    public static void main(String[] args) {
        int ilyaApples = 5;
        int sum = askKatya() + askAnton() + askDima() + ilyaApples;
        System.out.println(sum);
    }

    public static int askKatya() {
        int katyaApples = 3;
        return katyaApples;
    }

    public static int askAnton() {
        int antonApples = 4;
        return antonApples;
    }

    public static int askDima() {
        int dimaApples = 2;
        return dimaApples;
    }
}