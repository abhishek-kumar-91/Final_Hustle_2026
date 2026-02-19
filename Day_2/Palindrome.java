import java.util.*;

public class Palindrome{
    public static void main(String[] args) {
        //Palindrome number is that when we reverse any number then should be match with initial value like 12312 to 12312

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your number to check palindrome: ");
        int num = userInput.nextInt();
        int userValue = num;
        int ans = 0;

        while(num > 0){
            int digit = num % 10;
            ans = (ans * 10) + digit;
            num = num  / 10;
        }
          
        if(ans == userValue){
            System.out.println("Your number is palindrom!!" );
        }else{
            System.out.println("Sorry, your number is not palindrom. please enter another number!");
        }
    }
}