// Copyright Paul-Johan Seim

public class EngineeringEmployee extends Employee { 
// constructor
    public EngineeringEmployee(String name, int contract, int years, String department){
        super(name, contract, years, department);
    }
// getSalary method
    public double getSalary(){
        double salary = 25000 + (2500*getYears());
        return salary;
    }

}
