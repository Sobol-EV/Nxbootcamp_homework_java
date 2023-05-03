package nx.bootcamp.homework8_1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
    static int[] arr = new int[20];
    static Random rand = new Random();
    static Set<Integer> set = new HashSet<>();

    public static void main(String[] args) {
        for (int i=0; i < arr.length ; i++){
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i=0; i < arr.length ; i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }

}
