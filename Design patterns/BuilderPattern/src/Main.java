public class Main {
    public static void main(String[] args) {

        Employee employee=new EmployeeBuilder().setEmployeeID("121").setEmployeeName("Anish").Build();
        System.out.println(employee);
    }
}