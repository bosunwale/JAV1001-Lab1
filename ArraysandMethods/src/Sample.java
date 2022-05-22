import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize;
        String arrays;
        int[] number;
        int searchValue;
        System.out.println("Enter the size of number you want");
        arraySize = input.nextInt();
        number = new int[arraySize];
        System.out.println("Enter the " + arraySize + " Elements of the array");
        for(int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
        }
        System.out.println("Enter a value to search for: ");
        searchValue = input.nextInt();
        arrays = Arrays.toString(number);
        System.out.println(arrays);
        System.out.println("Average is: " + Average(number));
        ArrayReverse(number);
        SearchArray(number, searchValue);
    }
    public static int Sum(int[] arraySum){
        int sum = 0;
        for(int numbers : arraySum){
            sum = sum + numbers;
        }
        return sum;
    }
    public static int Average(int[] arrayAverage){
        int average = Sum(arrayAverage);
        return average / arrayAverage.length;
    }
    public static void ArrayReverse(int[] arrayReverse){
        int i;
        String reverseResult;
        for (i = arrayReverse.length-1; i >= 0; i--){
            reverseResult = String.valueOf(arrayReverse[i]);
            System.out.println(reverseResult);
        }
    }
    public static void SearchArray(int[]arrayElements, int arrayCheckValue){
        boolean check = false;
        for(int elements : arrayElements){
            if (elements == arrayCheckValue) {
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("The array contains " + arrayCheckValue);
        }else{
            System.out.println("The array does not contain " + arrayCheckValue);
        }
    }
}
