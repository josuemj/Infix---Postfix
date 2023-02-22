import Controller.Filer;
import Model.StackUsingArrayList;
import Model.StackUsingDoubleLinkedList;
import Model.StackUsingLinkedList;
import Model.StackVector;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Calculator myCalculator = Calculator.getCalculator();


        while (true) {

            System.out.println("\nIntroduce the option\n====================");
            System.out.println("1. operate");
            System.out.println("2. Exit\n====================");

            String run = in.nextLine();

            switch (run){

                case "1":
                    System.out.println("Select the stack implementation");
                    System.out.println("1. Single linked list\n2. Double linked list\n3. ArrayList\n4. Vector");

                    String stackType = in.nextLine();

                    switch (stackType){
                        case "1":
                            System.out.println("Implementing Single Linked List");
                            myCalculator.operatePostFix(new StackUsingLinkedList());
                            break;

                        case "2":
                            System.out.println("Implementing Double Linked List");
                            myCalculator.operatePostFix(new StackUsingDoubleLinkedList());
                            break;

                        case "3":
                            System.out.println("Implementing ArrayList");
                            myCalculator.operatePostFix(new StackUsingArrayList());
                            break;

                        case "4":
                            System.out.println("Vector");
                            myCalculator.operatePostFix(new StackVector());
                            break;

                        default:
                            System.out.println("Incorrect number retry");
                            break;
                    }
                    break;



                case "2":
                    System.out.println("Thank u!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Introduce a valid option");
                    break;
            }
        }
    }
}