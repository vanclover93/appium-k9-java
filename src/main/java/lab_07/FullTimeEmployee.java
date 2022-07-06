package lab_07;

public class FullTimeEmployee extends Employee{
    private static int fulltimeSalary = 50000;

    public FullTimeEmployee(String name){
        super(name);
    }
    public int getSalary(){
        return fulltimeSalary;
    }
}

