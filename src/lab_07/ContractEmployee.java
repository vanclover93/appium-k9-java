package lab_07;

public class ContractEmployee extends Employee{
    private static int fulltimeSalary = 40000;

    public ContractEmployee(String name){
        super(name);
    }
    public int getSalary(){
        return fulltimeSalary;
    }
}
