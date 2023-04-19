package nx.bootcamp.homework3;

public class Homework3_1_2 {
    public static void main(String[] args) {
        System.out.println("> --- WHILE ---");
        taskWhile(); // С помощью While
        System.out.println("> --- FOR ---");
        taskFor(); // С помощью For
    }

    public static void taskWhile() {
        int i = 100;
        while (i <= 400) {
            if ((i % 3 == 0 || i % 7 == 0) && i % 9 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void taskFor() {
        for (int i = 100; i <= 400; i++) {
            if ((i % 3 == 0 || i % 7 == 0) && i % 9 != 0) {
                System.out.println(i);
            }
        }
    }
}
