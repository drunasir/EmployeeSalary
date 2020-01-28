public class MainApp {
    public static void main(String[] args) {
        Employee ali = new Employee("Ali", 3000);
        ali.incrementSalaryByPercentage(10.00005);//Increasing by 10.5%

        double expResult = 3300.0015;
        double result = ali.getSalary();
        System.out.println(result);
        System.out.println(Double.compare(expResult,result) == 0);
    }
}
