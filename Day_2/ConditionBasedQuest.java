import java.util.Scanner;

public class ConditionBasedQuest{
    public static void main(String[] args){
        //Taking two number from user and operator (+ , - , / , *) on the basis give output

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your number A: ");
        int numA = userInput.nextInt();
        System.out.print("Enter your number B: ");
        int numB = userInput.nextInt();
        System.out.print("Enter your operator that you want to perform calculations (+,-,*,/,): ");
        char operator = userInput.next().charAt(0);

        if(operator == '+' ){
            int sum = numA + numB;
            System.out.println("Based on your input your addition value is: " + sum);
        }else if( operator == '-'){
            int substract = numA - numB;
            System.out.println("Based on your input your substract value is: " + substract);
        }else if(operator == '*'){
            int multiplication = numA * numB;
            System.out.println("Based on your input your multiplication value is: " + multiplication);
        }else if(operator == '/'){
            int division = numA / numB;
            System.out.println("Based on your input your division value is: " + division);
        }else{
            System.out.println("You choose the wrong operator or entered the wrong things please try again!!!");
        }

    }
}