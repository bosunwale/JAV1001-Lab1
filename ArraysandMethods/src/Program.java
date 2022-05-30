import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int userInput;
        int[] numberSize;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of numbers you want:");
        userInput = input.nextInt();
        numberSize = new int[userInput];
        System.out.println("Enter the numbers");
        for (int i = 0; i < numberSize.length; i++){
            numberSize[i] = input.nextInt();
        }
        System.out.println("Numbers entered are:");
        displayNumber(numberSize);
    }
    public static void displayNumber(int[] array){
        int i = array.length;
        for (int j = 0; j < i; j++){
            System.out.println(array[j]);
        }
    }
}
