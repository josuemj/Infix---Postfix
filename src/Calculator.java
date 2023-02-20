public class Calculator {

    private static Calculator uniqueCalculator = null;

    private Calculator(){} //Restricting the creation of the calculator

    public static Calculator getCalculator() {
        if (uniqueCalculator == null) {
            uniqueCalculator = new Calculator();
        }
        return uniqueCalculator;
    }



    //Punch of methods for this calculator

}
