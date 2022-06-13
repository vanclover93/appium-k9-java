package lab_07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryController {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new FullTimeEmployee());
        employeeList.add(new ContractEmployee());
        employeeList.add(new ContractEmployee());
        
        calculateSalary(employeeList);
    }
    
    public static int calculateSalary(ArrayList<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary();
        }
        System.out.println(totalSalary);
        return totalSalary;
    }
}
