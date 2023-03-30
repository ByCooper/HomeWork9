import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {

    public static int[] generateRandomArray() {
        int startSum = 100_000;
        int finalSum = 200_000;
        int[] totalCash = new int[30];
        for (int i = 0; i < totalCash.length; i++) {
            totalCash[i] = ((int) (Math.random() * startSum) + startSum);
        }
        return totalCash;
        //Сначала написал рандомное заполнение массива, а потом только увидел, что
        //по тексту предлагался свой вариант. Решил оставить свой
    }

    public static void main(String[] args) {
        int[] arrCash = generateRandomArray();
        System.out.println(Arrays.toString(arrCash));

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("\n" + "Задача №1" + "\n");

        int[] arrTask1 = generateRandomArray();
        int sumMonth = 0;
        for (int i = 0; i < arrTask1.length; i++) {
            sumMonth = sumMonth + arrTask1[i];
        }
        System.out.println(sumMonth);
    }

    public static void task2() {
        System.out.println("\n" + "Задача №2" + "\n");

        int[] arrTask2 = generateRandomArray();
        System.out.println(Arrays.toString(arrTask2));
        int minSum = arrTask2[0];
        int maxSum = arrTask2[0];

        for (int i = 1; i < arrTask2.length - 1; i++) {
            if (arrTask2[i] < minSum) {
                minSum = arrTask2[i];
            }
            if (arrTask2[i] > maxSum) {
                maxSum = arrTask2[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + " рублей");
    }

    public static void task3() {
        System.out.println("\n" + "Задача №3" + "\n");

        int[] arrTask3 = generateRandomArray();
        int sumMonth = 0;
        for (int i = 0; i < arrTask3.length - 1; i++) {
            sumMonth = sumMonth + arrTask3[i];
        }
        double averageSum = (double) sumMonth / arrTask3.length;
        System.out.println("Средняя сумма трат за месяц составила " + new DecimalFormat("###,###.##").format(averageSum) + " рублей");
    }

    public static void task4() {
        System.out.println("\n" + "Задача №4" + "\n");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char let = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = let;
            }
        System.out.println(Arrays.toString(reverseFullName));
    }
}