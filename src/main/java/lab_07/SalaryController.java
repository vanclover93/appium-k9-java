package lab_07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalaryController {
    public static void main(String[] args) {
        Employee teo = new FullTimeEmployee("Teo");
        Employee nam = new FullTimeEmployee("Nam");
        Employee nga = new FullTimeEmployee("Nga");
        Employee mai = new ContractEmployee("Mai");
        Employee lan = new ContractEmployee("Lan");

        ArrayList<Employee> employeeList = new ArrayList<>(Arrays.asList(teo,nam,nga,mai,lan));
        System.out.println("Total salary is:" + calculateSalary(employeeList));
    }
    
    public static int calculateSalary(ArrayList<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        return totalSalary;
    }
}
