import java.util.Scanner;

public class HW5 {
    public static void main (String [] args) {
        System.out.println("Введите число на которое будем увеличивать элементы массива");
        Scanner numDel = new Scanner(System.in);
        int numDelete = numDel.nextInt();
        int[][][] arg = {{{1, 2, 5, 6, 9}, {2, 6, 9, 8, 7}}, {{1, 2, 5, 9, 9}, {2, 6, 9, 18, 7}}};
        //int value= 3;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 5; k++) {
                    arg[i][j][k] += numDelete;
                    System.out.print(arg[i][j][k] + "  ");

                }
            }
        }
        ;
        System.out.println("   ");
        String[][] szach = new String[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        szach[i][j] = "W";
                    } else {
                        szach[i][j] = "B";
                    }
                } else {
                    if (j % 2 == 0) {
                        szach[i][j] = "B";

                    } else {
                        szach[i][j] = "W";
                    }

                }

            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(szach[i][j] + " ");
            }
            System.out.println("  ");
            // System.out.println("   ");
        }
    }
}
