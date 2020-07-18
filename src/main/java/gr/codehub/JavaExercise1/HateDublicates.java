package gr.codehub.JavaExercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HateDublicates {

    public static void main(String[] args) {
        boolean flag = false;
        List<Integer> userList = new ArrayList<Integer>();

        System.out.println("Enter some number and then 'ok' ");
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()) {
            userList.add(input.nextInt());
        }


        List<Integer> listWithoutDuplicates = userList
                .stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(listWithoutDuplicates);

    }


}
