package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {
        assertAll("fraction",
                () -> assertEquals(expectedNumerator, actual.getNumerator(), "Invalid numerator"),
                () -> assertEquals(expectedDenominator, actual.getDenominator(), "Invalid denominator")
        );
    }

    @Test
    public void testFractionIntInt() {
        fail();
    }

    @Test
    public void testFractionInt() {
        fail();
    }

    @Test
    public void testAddInt() {
        fail();
    }

    @Test
    public void testSubtractInt() {
        fail();
    }

    @Test
    public void testMultiplyInt() {
        fail();
    }

    @Test
    public void testDivideInt() {
        fail();
    }

    @Test
    public void testPow() {
        fail();
    }

    @Test
    public void testAddFraction() {
        fail();
    }

    @Test
    public void testSubtractFraction() {
        fail();
    }

    @Test
    public void testDivideFraction() {
        fail();
    }

    @Test
    public void testMultiplyFraction() {
        fail();
    }

    @Test
    public void testReciprocal() {
        fail();
    }

    @Test
    public void testAbs() {
        fail();
    }

    @Test
    public void testIsZero() {
        fail();
    }

    @Test
    public void testReduce() {
        fail();
    }

    @Test
    public void testToString() {
        fail();
    }

    @Test
    public void testByteValue() {
        fail();
    }

    @Test
    public void testDoubleValue() {
        fail();
    }

    @Test
    public void testFloatValue() {
        fail();
    }

    @Test
    public void testIntValue() {
        fail();
    }

    @Test
    public void testLongValue() {
        fail();
    }

    @Test
    public void testShortValue() {
        fail();
    }

    @Test
    public void testClone() {
        fail();
    }

    @Test
    public void testHashCode() {
        fail();
    }

    @Test
    public void testEquals() {
        fail();
    }

}
