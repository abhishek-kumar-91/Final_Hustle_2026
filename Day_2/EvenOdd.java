import java.util.*;

public class EvenOdd{
    public static void main(String[] args){
        //Imported Scanner class to take input from the user systems (Keyboard)
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num =  userInput.nextInt();

        //Checking user number is odd or even condition;

        if(num % 2 == 0 ){
            System.out.println("Your number is Even: " + num);
        }else{
            System.out.println("Your number is Odd: " + num);
        }
    } 
}