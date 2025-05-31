public class SalaryIncreaseVisitor implements EmployeeVisitor {

    private final double percentage; 

    public SalaryIncreaseVisitor(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public void visit(Manager manager) {
        int oldSalary = manager.getSalary();
        int increased = (int) Math.round(oldSalary * (1 + percentage / 100.0));
        manager.setSalary(increased);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        int oldSalary = salesPerson.getSalary();
        int increased = (int) Math.round(oldSalary * (1 + percentage / 100.0));
        salesPerson.setSalary(increased);
    }

    @Override
    public void visit(SupportStaff supportStaff) {
        int oldSalary = supportStaff.getSalary();
        int increased = (int) Math.round(oldSalary * (1 + percentage / 100.0));
        supportStaff.setSalary(increased);
    }
}
