import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){
        //Taking n number from user and print fibonanci series

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your n number for print fibonacci series: ");
        int fibo = userInput.nextInt();
        int start = 0;
        int end = 1;
        int next = 0;

        //Swap method used to print fibonacci series

        for(int i = 0; i < fibo; i++){
                if(i <= 1){
                    next = i;
                }else{
                    next = start + end;
                    start = end;
                    end = next;
                }
                System.out.println("fibonacci series: " + next);
        }
    }
}