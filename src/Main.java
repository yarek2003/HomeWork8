import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    }
    public static void task1 () {
        int[] threeInt = new int[] {1,2,3};
        double[] threeDouble = {1.57, 7.654, 9.986};
        boolean[] arrBoolean = {true, true, true, false};
    }

    public static void task2 () {
        System.out.println();
        System.out.println("Задача №2");
        int[] arrInt = new int[] {1,2,3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        boolean[] arrBoolean = {true, true, true, false};
        for (int i = 0; i < arrInt.length; i++) {
            if (i!= arrInt.length-1) {System.out.print(arrInt[i] + ", ");}
            else System.out.println(arrInt[i]);
        }
        for (int i = 0; i < arrDouble.length; i++) {
            if (i!= arrDouble.length-1) {System.out.print(arrDouble[i] + ", ");}
            else System.out.println(arrDouble[i]);
        }
        for (int i = 0; i < arrBoolean.length; i++) {
            if (i!= arrBoolean.length-1) {System.out.print(arrBoolean[i] + ", ");}
            else System.out.println(arrBoolean[i]);
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача №3");
        int[] arrInt = new int[] {1,2,3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        boolean[] arrBoolean = {true, true, true, false};
        for (int i = 2; i >= 0; i--) {
            if (i!= 0) {System.out.print(arrInt[i] + ", ");}
            else System.out.println(arrInt[i]);
        }
        for (int i = 2; i >= 0; i--) {
            if (i!= 0) {System.out.print(arrDouble[i] + ", ");}
            else System.out.println(arrDouble[i]);
        }
        for (int i = 3; i >= 0; i--) {
            if (i!= 0) {System.out.print(arrBoolean[i] + ", ");}
            else System.out.println(arrBoolean[i]);
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача №4");
        int[] arrInt = new int[] {1,2,3};
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 == 1) {
                arrInt[i] = arrInt[i] + 1;
            }
        }
        System.out.println(Arrays.toString(arrInt));

    }

}