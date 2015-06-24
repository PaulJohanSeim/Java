public class ManagementEmployee extends Employee{
// constructor
    public ManagementEmployee(String name, int contract, int years, String department){
        super(name, contract, years, department);
		contract = INDEFINITE;
    }
// getSalary method
    public double getSalary(){
        double salary = 40000 + (6000*getYears());
        return salary;
    }       
}