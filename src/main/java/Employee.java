
/**
 * This is Employee class
 *
 * @author usman
 * @version 1.0
 */
public class Employee {

    /*  Instance variables  */
    private String name;
    private double salary;

    /**
     * No args Constructor
     */
    public Employee() {
        this.name = "";
        this.salary = 0.0;

    }

    /**
     * Constructor that sets name and salary
     *
     * @param aName   the name of Employee
     * @param aSalary the Salary of Employee
     */
    public Employee(String aName, double aSalary) {
        this.name = aName;
        this.salary = aSalary;
    }

    /**
     * @return return the name of Employee
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return Gives the salary of Employee
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * This method increases the salary by the percentage provided as parameter
     * The new salary would be set to incremented salary
     *
     * @param percentage the percentage to increment the salary
     */
    public void incrementSalaryByPercentage(double percentage) {
        salary = salary * (1 + (percentage / 100));
    }

}//end of class