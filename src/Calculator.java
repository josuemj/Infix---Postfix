import Controller.Filer;
import Controller.InfixToPostfix;
import Model.IStack;

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
     * Operates the postFix expression with any stack implementation.
     * @param myStack, can introduce the stack kind implementation.
     * @return
     */
    public int operatePostFix(IStack myStack){

        //first we gotta get the infix expression
        String infix = Filer.getInfixExpression();
        System.out.println("INFIX: "+infix);

        //Then
        String postFix = InfixToPostfix.infixToPostfix(infix);
        System.out.println("POSTFIX: "+postFix);

        return 0;





    }
}
