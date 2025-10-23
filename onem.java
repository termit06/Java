import java.util.Arrays;
import java.util.Scanner;

public class onem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double b[] = {-15.1, 0.8, 32.3, 7.5, -1.5, 2.4, -6.3, 15.5};

        System.out.println(Arrays.toString(b));
        System.out.println("Минимальное значение - " + getMin(b));
        System.out.println("Максимальное значение - " + getMax(b));
        
        double average = getAverage(b);
        System.out.println("Среднее арифметическое - " + average);
        
        int count = countLessThanAverage(b, average);
        System.out.println("Количество элементов меньше среднего - " + count);
        
        double[] lessThanAverage = getLessThanAverage(b, average);
        System.out.println("Элементы меньше среднего: " + Arrays.toString(lessThanAverage));
    }
    
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
    
    public static int countLessThanAverage(double[] arr, double average) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        return count;
    }
    
    public static double[] getLessThanAverage(double[] arr, double average) {
        int count = countLessThanAverage(arr, average);
        double[] result = new double[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
    
    public static double getMax(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static double getMin(double[] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}