import java.util.ArrayList;
import java.util.List;

public class StaffList {

    private final List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    
    public int getTotalSalary() {
        int sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }


    public void accept(EmployeeVisitor visitor) {
        for (Employee e : employees) {
            e.accept(visitor);
        }
    }

    
    public void printAllSalaries() {
        for (Employee e : employees) {
            System.out.println(e.getClass().getSimpleName() + " salary = " + e.getSalary());
        }
    }
}
