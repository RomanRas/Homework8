import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] floatArray = {1.57, 7.654, 9.986};

        int[] randomArray = {2, 16, 54, -34, 15, 94, 15};

        System.out.println();

        //Задача 2
        System.out.println("Задача 2");

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);
            } else
                System.out.print(array[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < floatArray.length; i++) {
            if (i == floatArray.length - 1) {
                System.out.print(floatArray[i]);
            } else
                System.out.print(floatArray[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < randomArray.length; i++) {
            if (i == randomArray.length - 1) {
                System.out.print(randomArray[i]);
            } else
                System.out.print(randomArray[i] + ", ");
        }
        System.out.println("\n");


        //Задача 3
        System.out.println("Задача 3");

        for(int i = array.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array[i]);
            } else
                System.out.print(array[i] + ", ");
        }
        System.out.println();

        for(int i = floatArray.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(floatArray[i]);
            } else
                System.out.print(floatArray[i] + ", ");
        }
        System.out.println();

        for(int i = randomArray.length -1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(randomArray[i]);
            } else
                System.out.print(randomArray[i] + ", ");
        }
        System.out.println("\n");

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}