// Copyright Paul-Johan Seim

public class AdministrationEmployee extends Employee{                  
// constructor
    public AdministrationEmployee(String name, int contract, int years, String department){
        super(name, contract, years, department);		
		contract = TEMPORARY;
		years = 0;
    }
    
// getSalary method
    public double getSalary(){
        double salary = 18000;
        return salary;
    }

}
