package src.exercicies.chapter01;

public class SummationOfASeries {
    public static void returnSummationOfASeries() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 0;
        for(int i = 0; i <= 8; i++) {

            num = num + arr[i];
            System.out.println(num);
        }
    }
}
