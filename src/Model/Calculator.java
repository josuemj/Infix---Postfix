package Model;

import Controller.Filer;
import Controller.InfixToPostfix;

public class Calculator {

    private static Calculator uniqueCalculator = null;

    private Calculator(){} //Restricting the creation of the calculator

    public  static Calculator getCalculator() {
        if (uniqueCalculator == null) {
            uniqueCalculator = new Calculator();
        }
        return uniqueCalculator;
    }

    /**
     * Checks if the char given corresponds to an operand.
     * @param character
     * @return
     */

    public boolean isOperand(String character){
        if (character.equals("+") || character.equals("*") || character.equals("-") || character.equals("/")){
            return true;
        }
        return false;
    }

    /**
     * Operates the postFix expression with any stack implementation.
     * @param myStack, can introduce the stack kind implementation.
     * @return
     */
    public int operatePostFix(IStack myStack) {



        //first we gotta get the infix expression
        String infix = Filer.getInfixExpression();
        System.out.println("=============");
        System.out.println("INFIX: " + infix);

        //Then convert it to postfix
        String postFix = InfixToPostfix.infixToPostfix(infix);
        System.out.println("POSTFIX: " + postFix);
        System.out.println("=============");

        //then operate as postfix
        System.out.println(postFix.length());
        String[] chars = postFix.split("");

        //operating with stack
        System.out.println("OPERATING");

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
            if (isOperand(chars[i])) {
                int result = 0;
                int a = (int) myStack.pull();
                int b = (int) myStack.pull();

                switch (chars[i]) {
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    case "/":
                        result = a/b;
                        break;
                }
                myStack.push(result);

            }else{
                try{
                    myStack.push(Integer.parseInt(chars[i]));
                } catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("RESULT:\n======");
        return (int) myStack.peek();
    }
}
