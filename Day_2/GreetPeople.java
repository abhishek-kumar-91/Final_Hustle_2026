import java.util.*;

public class GreetPeople{
    public static void main(String[] args){
        //Greet a particular person that user give as a input

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String name = userInput.nextLine();

        //Greet each particular people

        System.out.println("Hello " + name + ", " + "Nice to meet you!");
    }
}