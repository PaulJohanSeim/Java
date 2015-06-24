public class Staff{
public static void main(String[] args) {
    
// object array creation
// declaration of the length of the array employeeArray
    Employee [] employeeArray = new Employee[6];

// creation of the six staff employees
    Employee employee1 = new ManagementEmployee("Bill", Employee.INDEFINITE, 9, "Management");
    Employee employee2 = new EngineeringEmployee("Anna", Employee.INDEFINITE, 9, "Engineering");
    Employee employee3 = new EngineeringEmployee("John", Employee.INDEFINITE, 5, "Engineering");
    Employee employee4 = new EngineeringEmployee("Elizabeth", Employee.TRAINING, 3, "Engineering");
    Employee employee5 = new EngineeringEmployee("Michael", Employee.TRAINING, 2, "Engineering");
    Employee employee6 = new AdministrationEmployee("Albert", Employee.TEMPORARY, 5, "Administration");

// the staff employees are stored in the array: employeeArray
    employeeArray[0] = employee1;
    employeeArray[1] = employee2;
    employeeArray[2] = employee3;
    employeeArray[3] = employee4;
    employeeArray[4] = employee5;
    employeeArray[5] = employee6;
    
// print info for all of the employees
    for(int i = 0; i < employeeArray.length; i++) {
        employeeArray[i].toString();
    }

// salary calculation and printing
    // salary calculation for all Management employees
    double totalManagement = employee1.getSalary();
    System.out.println("\n" + "MANAGEMENT TOTAL SALARY: " + totalManagement + " bitcoins.");

    // salary calculation for all Engineering employees
    double totalEngineering = employee2.getSalary() + employee3.getSalary() + employee4.getSalary() 
            + employee5.getSalary();
    System.out.println("ENGINEERING TOTAL SALARY: " + totalEngineering + " bitcoins.");
    
    // salary calculation for all Administration employees
    double totalAdministration = employee6.getSalary();
    System.out.println("ADMINISTRATION TOTAL SALARY: " + totalAdministration + " bitcoins.");
    
    // total salary calculation for all employees at ACME Corporation
    double totalACME = 0.0;
    for(int i = 0; i < employeeArray.length; i++){
        totalACME = totalACME + employeeArray[i].getSalary();
    }
    System.out.println("ACME TOTAL SALARY: " + totalACME + " bitcoins.");
    
}
}