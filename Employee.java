package task10;

public class Employee {
    public int ID;
    public String firstName;
    public String lastName;
    public String name;
    private int salary;
    public int annualSalary;
    public int percent;
    
    public Employee(int ID, String firstName, String lastName,int percent){
       this.ID=ID;
       this.firstName=firstName;
       this.lastName=lastName;
       this.percent=percent;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
    public int getID() {
        return ID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    
    public String getName(){
       String name=firstName+lastName;
       return name;
    }
    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary() {
        int annualSalary=salary*12;
        return annualSalary;
    }

    public int raiseSalary(int percent){
      salary=salary+(salary*percent)/100;
      return salary;

    }
    public static void main(String[] args) {
        Employee employee=new Employee(1000,"Rohit", "Sharma", 10);
        employee.setSalary(50000);
        employee.salary=employee.raiseSalary(employee.percent);
       
        System.out.println(("Employee[id= "+ employee.getID()+", name= "+employee.getName()+", salary= "+employee.salary+"]").toString());
    }
}
