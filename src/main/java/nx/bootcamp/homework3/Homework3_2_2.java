package nx.bootcamp.homework3;

public class Homework3_2_2 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 4, 6, 3, 8, 10, 19, 12, 11, 18, 20, 15, 17, 16, 13, 14};
        bubbleSort(arr);
        System.out.println("--> Отсортированный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        // Функция сортирует целочисленный массив с помощью сортировки пузырьком
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
