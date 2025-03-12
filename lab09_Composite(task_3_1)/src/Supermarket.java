public class Supermarket {
    public static void main(String[] args) {
        
        Manager director = new Manager("Dmitrii", 5000);

        Manager meatDeptManager = new Manager("Petro (meat dept manager)", 3000);
        Manager dairyDeptManager = new Manager("Nastya (meat dept manager)", 3000);
        Manager bakeryDeptManager = new Manager("Sophia (meat dept manager)", 3000);

        meatDeptManager.addEmployee(new Salesperson("Victor (meat seller)", 2000));
        meatDeptManager.addEmployee(new Salesperson("Oleg (meat seller)", 2000));
        meatDeptManager.addEmployee(new Salesperson("Anna (meat seller)", 2000));

        dairyDeptManager.addEmployee(new Salesperson("Sergii (dairy seller)", 1800));
        dairyDeptManager.addEmployee(new Salesperson("Illya (dairy seller)", 1800));
        dairyDeptManager.addEmployee(new Salesperson("Karina (dairy seller)", 1800));

        bakeryDeptManager.addEmployee(new Salesperson("Oleksii (bakery seller)", 1900));
        bakeryDeptManager.addEmployee(new Salesperson("Pavlo (bakery seller)", 1900));
        bakeryDeptManager.addEmployee(new Salesperson("Mark (bakery seller)", 1900));

        director.addEmployee(meatDeptManager);
        director.addEmployee(dairyDeptManager);
        director.addEmployee(bakeryDeptManager);

        System.out.println("=== Payroll Processing ===\n");
        director.payExpenses();
    }
}
