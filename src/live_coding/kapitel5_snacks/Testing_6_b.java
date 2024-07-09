package live_coding.kapitel5_snacks;


/*Annotations in JUnit:
@Test: Indicates that the method is a test method.
@BeforeEach: Method annotated with this will run before each test method.
@AfterEach: Method annotated with this will run after each test method.
@BeforeAll: Static method annotated with this will run once before all test methods in the class.
@AfterAll: Static method annotated with this will run once after all test methods in the class.
@Disabled: Used to disable a test method or class.*/

// --------------------------------
/*Assertions in JUnit
assertEquals(expected, actual): Checks that two values are equal.
assertNotEquals(unexpected, actual): Checks that two values are not equal.
assertTrue(condition): Checks that a condition is true.
assertFalse(condition): Checks that a condition is false.
assertNull(object): Checks that an object is null.
assertNotNull(object): Checks that an object is not null.
assertThrows(expectedType, executable): Checks that an exception of the specified type is thrown.*/


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class Testing_6_b {

    @Test
    public void testFindMaxWithPositiveNumbers() {
        int[] arr = {1, 3, 7, 2, 5};
        assertEquals(7, Main_6_a.findeMaximum(arr), "The maximum value should be 7");
        assertNotEquals(1, Main_6_a.findeMaximum(arr));
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] arr = {-3, -1, -7, -2, -5};
        assertEquals(-1, Main_6_a.findeMaximum(arr), "The maximum value should be -1");
        assertNotEquals(-7, Main_6_a.findeMaximum(arr), "The maximum value should be -1");

    }

    @Test
    public void testFindMaxWithSingleElement() {
        int[] arr = {42};
        assertEquals(42, Main_6_a.findeMaximum(arr), "The maximum value should be 42");
        assertTrue(6<7);
        assertFalse(6>7);
    }

    @Test
    public void testFindMaxWithAllSameElements() {
        int[] arr = {5, 5, 5, 5, 5};
        assertEquals(5, Main_6_a.findeMaximum(arr), "The maximum value should be 5");
    }

}
