package live_coding.kapitel5_snacks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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

public class _TestClass {
    @Test
    public void testFindMax(){
        assertEquals(2, _Testing.findMax(new int []{1,3,4}));
        assertEquals(4, _Testing.findMax(new int []{1,3,4}));

        assertTrue(4<2);
    }
}


