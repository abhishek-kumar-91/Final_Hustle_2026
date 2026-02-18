import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args){
        //Calculating simple interest SI = P * R * T / 100

        //Taking principle amount from user
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your principle Amount: ");
        float principle = userInput.nextFloat();
        System.out.println();

        //Taking Rate of amount
        System.out.print("Enter your Rate: ");
        float rate = userInput.nextFloat();
        System.out.println();

        //Taking Time
        System.out.print("Enter your time: ");
        float time = userInput.nextFloat();

        //Simple interest calculation here

        float simpleInterest = (principle * rate * time) / 100;

        System.out.println("Your final simple interest answered: " +  simpleInterest);


    }
}