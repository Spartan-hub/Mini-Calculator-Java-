package in.phenomenalbloggers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
   float number_1, number_2;
        System.out.print("Enter the first number:");
Scanner scan = new Scanner(System.in);
number_1 = scan.nextFloat();

        System.out.print("Enter the second number:");
Scanner scan2 = new Scanner(System.in);
number_2 = scan.nextFloat();
        System.out.print("You have entered:");
        System.out.print(number_1);
        System.out.print(" and ");
        System.out.println(number_2);
String prompt = "Enter 0 for addition, 1 for asubstraction, 2 for multiplication, 3 for divison.";
        System.out.println(prompt);
        int input = scan.nextInt();
        switch(input){
            case 0:
                System.out.print("Your results are:");
                System.out.println(number_1+number_2);
                break;
                case 1:
                System.out.print("Your results are:");
                    System.out.println(number_1-number_2);
                break;
                case 2:
                System.out.print("Your results are:");
                    System.out.println(number_1*number_2);
                break;
                case 3:
                System.out.print("Your results are:");
                    System.out.println(number_1/number_2);
                break;


            default:
                System.out.println("Invalid Input");
        }
        System.out.println("Thank you for using Phenomenal Techs's Mini Calculator Project");
        System.out.println("Bye");
    }
}
