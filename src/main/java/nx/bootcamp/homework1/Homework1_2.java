package nx.bootcamp.homework1;

public class Homework1_2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    public static void exercise1() {
        //Первая задача
        int total_seconds = 49690;
        int hours = total_seconds / 3600;
        int minutes = (total_seconds % 3600) / 60;
        int seconds = total_seconds % 60;
        System.out.println("CURRENT TIME: " + hours + " HOURS " + minutes + " MINUTES " + seconds + " SECONDS.");
    }
    public static void exercise2() {
        //Вторая задача
        String current_time = "13:48:10";
        int hours = Integer.parseInt(current_time.substring(0, 2));
        int minutes = Integer.parseInt(current_time.substring(3, 5));
        int seconds = Integer.parseInt(current_time.substring(6, 8));
        int total_seconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println(total_seconds);
    }
}
