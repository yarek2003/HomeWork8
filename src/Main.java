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
        int[] threeInt = new int[] {1,2,3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        boolean[] arrBoolean = {true, true, true, false};
        for (int i = 0; i < threeInt.length; i++) {
            System.out.print(threeInt[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrDouble.length; i++) {
            System.out.print(arrDouble[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arrBoolean.length; i++) {
            System.out.print(arrBoolean[i] + " ");
        }
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача №3");
        int[] arrInt = new int[] {1,2,3};
        double[] arrDouble = {1.57, 7.654, 9.986};
        boolean[] arrBoolean = {true, true, true, false};
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrInt[i] + " ");
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {
            System.out.print(arrDouble[i] + " ");
        }
        System.out.println();
        for (int i = 3; i >= 0; i--) {
            System.out.print(arrBoolean[i] + " ");
        }
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача №4");
        int[] threeInt = new int[] {1,2,3};
        for (int i = 0; i < threeInt.length; i++) {
            if (threeInt[i] % 2 == 1) threeInt[i] = threeInt[i]+1;
            System.out.print(threeInt[i]+" ");
        }

    }

}