import java.util.Scanner;

public class Main {   
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = input.nextInt();

        int reverse = 0;

        // while loop
        while (number > 0) {

            int lastNum = number % 10;   

            reverse = reverse * 10 + lastNum; 

            number = number / 10;     

        }

        System.out.println("the reversed number: " + reverse); 
    }
}