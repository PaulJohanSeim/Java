// Copyright Paul-Johan Seim

public abstract class Employee implements Employed{

// contract types (constants)
    public static final int TEMPORARY = 0;
    public static final int TRAINING = 1;
    public static final int INDEFINITE = 2;
    
// attributes to describe the employee
    private String name;
    private int contract;
    private int years;
    private String department;

// constructor
    public Employee(String otherName, int otherContract, int otherYears, String otherDepartment){
        name = otherName;
        contract = otherContract;
        years = otherYears;
        department = otherDepartment;
    }

// name getter and check for illegal arguments
    public String getName(){
        if(name == "")
            throw new IllegalArgumentException("Invalid name"); 
        return name;
    }

// contract getter and check for illegal arguments
    public int getContract(){
        if((contract != 0) || (contract !=1) || (contract !=2))
            throw new IllegalArgumentException("Invalid contract"); 
        return contract;
    }
    
// years getter and check for illegal arguments
    public int getYears(){
        if(years < 0)
            throw new IllegalArgumentException("Invalid number of years"); 
        return years;
    }

// department getter and check for illegal arguments
    public String getDepartment(){
        if(department == "")
            throw new IllegalArgumentException("Invalid department"); 
        return department;
    }

// name setter and check for illegal arguments
	public void setName(String n) throws Exception{
	    name = n;
	    if(name == "")
            throw new IllegalArgumentException("Invalid name");
	}
	
// contract setter and check for illegal arguments
	public void setContract(int c) throws Exception{
        contract = c;
        if((contract != 0) || (contract !=1) || (contract !=2))
            throw new IllegalArgumentException("invalid contract");
   }
	
// years setter and check for illegal arguments
	public void setYears(int y) throws Exception{
        years = y;
        if(years<0)
            throw new IllegalArgumentException("invalid number of years");
	}

// department setter and check for illegal arguments
	public void setDepartment(String d) throws Exception{
	    department = d;
	    if(department == "")
            throw new IllegalArgumentException("Invalid department"); 
	}
	
// getSalary method
    public abstract double getSalary();
    
// toString method
    // convert the different types of contracts from integer to string
    public String toString(){
        String contractK = "";
        if(contract == 0){
            contractK = "temporary";
        }else if(contract == 1){
            contractK = "training";
        }else if(contract == 2){
            contractK = "indefinite";
        }
        String result =  
	            name + ": "
				+ department + " department, "
				+ contractK + " contract, "
				+ years + " years in the company, "
				+ "salary of " + getSalary() + " bitcoins";
		System.out.println(result);
    return result;
    }
    
}
