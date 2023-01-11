import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {14.9, -18.6, 0.0, 86.4, -4.4, 5.5, -4.8, -4.9, 87.2, 6.1, 7.8, -53.9, 31.3, 44.4, 9.0};
        System.out.println(Arrays.toString(numbers));

        double average = 0;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[j] > 0) {
                        average += numbers[j];
                        count++;
                        }
                    }
                    break;
                }

            }
            System.out.println("среднее арифметическое положительных чисел, после первого отрицательного равно: " + average / count);
        }
    }
