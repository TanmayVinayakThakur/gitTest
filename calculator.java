import java.util.*;

public class calculator {
    public static void main(String args[]){
        System.out.println("-------WELCOME TO YOUR CALCULATOR-------");
        Scanner ez= new Scanner(System.in);
        int a= ez.nextInt();
        char operator= ez.next().charAt(0);
        int b= ez.nextInt();
        switch (operator) {
            case '+':
            int sum= a+b;
            System.out.println(sum);
                
                break;
            case '-':
            int subtraction= a-b;
            System.out.println(subtraction);
            break;
            
            case'*': 
            int mult= a*b;
            System.out.println(mult);

            case '/':
            int div= a/b;
            System.out.println(div);
            break;

            case'%':
            int mod= a%b;
            System.out.println(mod);
            break;
            default:
            System.out.println("Enter valid operator");
                break;
        }

    }
    
}
