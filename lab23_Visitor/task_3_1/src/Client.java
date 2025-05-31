public class Client {

    public static void main(String[] args) {
        StaffList staffList = new StaffList();

        staffList.addEmployee(new Manager(60000));
        staffList.addEmployee(new SalesPerson(50000));
        staffList.addEmployee(new SalesPerson(40000));
        staffList.addEmployee(new SupportStaff(30000)); 

        System.out.println("=== Before any Visitor ===");
        staffList.printAllSalaries();
        System.out.println("Total payout: " + staffList.getTotalSalary());
        System.out.println();

        SalaryIncreaseVisitor increase10 = new SalaryIncreaseVisitor(10.0);
        staffList.accept(increase10);

        System.out.println("=== After 10% increase ===");
        staffList.printAllSalaries();
        System.out.println("Total payout: " + staffList.getTotalSalary());
        System.out.println();

        SalaryPenaltyVisitor penalty500 = new SalaryPenaltyVisitor(500);
        staffList.accept(penalty500);

        System.out.println("=== After $500 penalty ===");
        staffList.printAllSalaries();
        System.out.println("Total payout: " + staffList.getTotalSalary());
        System.out.println();

        SalaryIncreaseVisitor increase5 = new SalaryIncreaseVisitor(5.0);
        staffList.accept(increase5);

        System.out.println("=== After additional 5% increase ===");
        staffList.printAllSalaries();
        System.out.println("Total payout: " + staffList.getTotalSalary());
    }
}
