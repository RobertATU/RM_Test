package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void testName(){
        Employee em = new Employee("Nathan","098765432112");
        assertEquals("Nathan",em.getName());
    }
    @Test
    void testNameFail(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Nat","09865432112"));
        assertEquals("Name must be at least 5 characters",exMessage.getMessage());
        System.out.println(exMessage);
    }

    @AfterEach
    void tearDown() {
    }
}