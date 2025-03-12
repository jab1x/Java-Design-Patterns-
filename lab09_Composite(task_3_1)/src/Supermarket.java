public class Supermarket {
    public static void main(String[] args) {
        
        Manager director = new Manager("Alice", 5000);

        // відділи магазину
        Manager meatDeptManager = new Manager("John (Meat Dept Manager)", 3000);
        Manager dairyDeptManager = new Manager("Emma (Dairy Dept Manager)", 3000);
        Manager bakeryDeptManager = new Manager("Sophia (Bakery Dept Manager)", 3000);

        // менеджери
        meatDeptManager.addEmployee(new Salesperson("Bob (Meat Seller)", 2000));
        meatDeptManager.addEmployee(new Salesperson("Mike (Meat Seller)", 2000));
        meatDeptManager.addEmployee(new Salesperson("Anna (Meat Seller)", 2000));

        dairyDeptManager.addEmployee(new Salesperson("Sarah (Dairy Seller)", 1800));
        dairyDeptManager.addEmployee(new Salesperson("David (Dairy Seller)", 1800));
        dairyDeptManager.addEmployee(new Salesperson("Tom (Dairy Seller)", 1800));

        bakeryDeptManager.addEmployee(new Salesperson("Linda (Bakery Seller)", 1900));
        bakeryDeptManager.addEmployee(new Salesperson("Karen (Bakery Seller)", 1900));
        bakeryDeptManager.addEmployee(new Salesperson("Paul (Bakery Seller)", 1900));

        // відділи, якими керує директор
        director.addEmployee(meatDeptManager);
        director.addEmployee(dairyDeptManager);
        director.addEmployee(bakeryDeptManager);

        System.out.println("=== Payroll Processing ===\n");
        director.payExpenses();
    }
}
