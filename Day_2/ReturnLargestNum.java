import java.util.Scanner;

public class ReturnLargestNum{
    public static void main(String[] args){
        //Take two input from user and return largest one.

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = userInput.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = userInput.nextInt();

        //Checking largest number

        if(num1 > num2 ){
            System.out.println("Here is your largest number: " + num1);
        }else{
            System.out.println("Here is your largest number: " + num2);
        }
    }
}