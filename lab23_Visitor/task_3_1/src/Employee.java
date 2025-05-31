public interface Employee {
    
    int getSalary();

    void setSalary(int salary);

    void accept(EmployeeVisitor visitor);
}
