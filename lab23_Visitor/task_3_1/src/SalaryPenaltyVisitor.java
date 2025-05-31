public class SalaryPenaltyVisitor implements EmployeeVisitor {

    private final int penaltyAmount; 

    public SalaryPenaltyVisitor(int penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    @Override
    public void visit(Manager manager) {
        int oldSalary = manager.getSalary();
        int reduced = Math.max(0, oldSalary - penaltyAmount);
        manager.setSalary(reduced);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        int oldSalary = salesPerson.getSalary();
        int reduced = Math.max(0, oldSalary - penaltyAmount);
        salesPerson.setSalary(reduced);
    }

    @Override
    public void visit(SupportStaff supportStaff) {
        int oldSalary = supportStaff.getSalary();
        int reduced = Math.max(0, oldSalary - penaltyAmount);
        supportStaff.setSalary(reduced);
    }
}
