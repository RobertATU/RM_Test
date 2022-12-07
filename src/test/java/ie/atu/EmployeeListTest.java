package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    EmployeeList emlist = new EmployeeList();
    @BeforeEach
    void setUp() {

    }

    @Test
    void addEmployeeTest(){
        emlist.addEmployee(new Employee("Nathan","098765432112"));
        assertEquals(1,emlist.arraySize);


    }

    @Test
    void addEmployeeTestFail(){
        emlist.addEmployee(new Employee("Nathan","098765432112"));
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> emlist.addEmployee(new Employee("Nat","09865432112")));



    }

    @AfterEach
    void tearDown() {
    }
}