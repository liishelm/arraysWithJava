java import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        for(int i=0; i<numbers.length; i++){
            System.out.println("Please enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        int maxValue = numbers[0];
        int minValue = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("The maximum value in the array is: "+ maxValue);
        System.out.println("The minimum value in the array is: " + minValue);
        scanner.close();
    }
}
