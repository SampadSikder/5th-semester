public class Employee {
    private String employeeName;
    private String employeeID;
    private Double KPI;

    public Employee(String employeeName, String employeeID, Double KPI){
        this.employeeName=employeeName;
        this.employeeID=employeeID;
        this.KPI=KPI;
    }
    @Override
    public String toString() {
        return this.employeeID+" "+this.employeeName+" "+this.KPI;
    }
}

abstract class EmployeeBuilder{

    private String employeeName;
    private String employeeID;
    private Double KPI;

    public EmployeeBuilder setEmployeeID(String employeeID);
   

    public EmployeeBuilder setEmployeeName(String employeeName){
        this.employeeName=employeeName;
        return this;
    }
    public EmployeeBuilder setKPI(Double KPI){
        this.KPI=KPI;
        return this;
    }

    public Employee Build(){
        return new Employee(this.employeeName,this.employeeID,this.KPI);
    }
}

class EmployeeIDBuilder extends EmployeeBuilder{
    private String employeeId;

    public EmployeeBuilder setEmployeeID(String employeeID){
        this.employeeID=employeeID;
        return this;
    }
}