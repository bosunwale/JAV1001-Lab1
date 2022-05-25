import java.util.Arrays;
import java.util.Scanner;

public class Sample {
    public static final String alphabets = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arraySize, searchValue;
        String arrays;
        int[] number;
        int encrpytkey, decrpytkey;
        String encryptMessage, decryptMessage;
        System.out.println("Enter a message to encrypt");
        encryptMessage = input.nextLine();
        System.out.println("Enter encrpytkey to shift");
        encrpytkey = input.nextInt();
        System.out.println("Encrypted message is: " + CeaserCipherEncrypt(encryptMessage, encrpytkey));
        System.out.println("Enter a message to decrypt");
        decryptMessage = input.next();
        System.out.println("Enter key to shift to decrypt message");
        decrpytkey = input.nextInt();
        System.out.println("Encrypted message is: " + CeaserCipherDecrypt(decryptMessage, decrpytkey));

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
            System.out.printf("Yes, %d exist in the array", arrayCheckValue);
        }else{
            System.out.printf("No, %d does not exist in the array", arrayCheckValue);
        }
    }

    public static String CeaserCipherEncrypt(String text, int shiftValue){
        StringBuilder textCipher = new StringBuilder();
        int keyValue, characterPosition;
        char replaceValue;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++){
            characterPosition = alphabets.indexOf(text.charAt(i));
            keyValue = (shiftValue + characterPosition) % 26;
            replaceValue = alphabets.charAt(keyValue);
            textCipher.append(replaceValue);
        }
        return textCipher.toString();
    }

    public static String CeaserCipherDecrypt(String decryptText, int shiftValue){
        decryptText = decryptText.toLowerCase();
        StringBuilder message = new StringBuilder();
        for(int i = 0; i < decryptText.length(); i++){
            int characterPosition = alphabets.indexOf(decryptText.charAt(i));
            int keyValue = (shiftValue + characterPosition) % 26;
            if (keyValue < 0){
                keyValue = alphabets.length() + keyValue;
            }
            char replaceValue = alphabets.charAt(keyValue);
            message.append(replaceValue);
        }
        return message.toString();
    }
}
