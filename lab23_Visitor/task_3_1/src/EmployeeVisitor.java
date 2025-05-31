public interface EmployeeVisitor {
    void visit(Manager manager);
    void visit(SalesPerson salesPerson);
    void visit(SupportStaff supportStaff);
}
