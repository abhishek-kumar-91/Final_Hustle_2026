import java.util.Scanner;

public class InrToUsd{
    public static void main(String[] args){
        //Take INR and convert into the USD

        Scanner userInput = new Scanner(System.in);
        System.out.print("Inter your ruppees: ");

        int inrCurrency = userInput.nextInt();

        int usdConvert = inrCurrency / 80;

        System.out.println("Your INR " + inrCurrency + " After converted to USD: " + usdConvert);
    }
}