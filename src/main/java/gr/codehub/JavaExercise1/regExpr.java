package gr.codehub.JavaExercise1;

import java.util.Scanner;

public class regExpr {

    public static boolean validation(String  passwd){
    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
    return passwd.matches(pattern);
    }


    public static void main(String[] args) {
        float number;
        System.out.println("Enter a valid password ");
        Scanner input = new Scanner(System.in);
        String password= input.nextLine();
        boolean x=validation(password);
        if(x){
            System.out.println("Valid Password");
        }
        else{
            System.out.println("No Valid Password");
        }

    }
}
