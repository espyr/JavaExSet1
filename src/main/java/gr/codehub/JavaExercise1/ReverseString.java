package gr.codehub.JavaExercise1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static String reverse(String input){
        StringBuilder result = new StringBuilder();
        Stack st = new Stack();
        //String x="karekla";
        int length=input.length();
        char[] JavaCharArray=input.toCharArray();
        for (char c:JavaCharArray) {
            st.push(c);
        }

        for(int i = 0; i < length; i++)
        {
            result.append(st.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println("Enter a word ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(reverse(word));
        }

    }



