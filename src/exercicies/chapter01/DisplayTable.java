package src.exercicies.chapter01;

public class DisplayTable {
    public static void returnDisplayTable() {
        for (int i = 1; i <= 8; i++) {
            System.out.println();

            for (int j = 1; j <= 7; j++) {
                double num = Math.pow(i, j);
                System.out.print(num + " ");
            }
        }
    }
}