package testsSamples;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void getCalculator() {
    }

    @org.junit.jupiter.api.Test
    void isOperand() {

    }

    @org.junit.jupiter.api.Test
    void operatePostFix() {
        assertEquals(32,"5+(2*9)+9");
    }
}