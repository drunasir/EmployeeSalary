import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usman
 * @version
 */
public class EmployeeTest {

    public EmployeeTest() {

    }

    /**
     * Test of getSalary method, of class Employee.
     */
    @Test
    public void testGetSalary() {
        System.out.println("Test 01 getSalary");

        Employee instance = new Employee("Saleem", 5000.00);
        double expResult = 5000.0;
        double result = instance.getSalary();

        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of incrementSalaryByPercentage method, of class Employee.
     */
    @Test
    public void testIncrementSalaryByPercentage() {
        System.out.println("Test 02 IncrementSalaryByPercentage");

        Employee instance = new Employee("Saleem", 5000.00);
        instance.incrementSalaryByPercentage(10);//Increasing by  10%

        double expResult = 5500.0;
        double result = instance.getSalary();
        assertEquals(expResult, result, 0.0);

    }//end of function

    @Test
    public void testIncrementSalaryByPercentageAgain() {
        System.out.println("Test 03 IncrementSalaryByPercentageAgain");
        Employee localInstance = new Employee("Ali", 3000);
        localInstance.incrementSalaryByPercentage(10.00005);

        double expResult = 3300.0015;
        double result = localInstance.getSalary();


        assertEquals(expResult, result, 0.0);
    }

}//end of testclass