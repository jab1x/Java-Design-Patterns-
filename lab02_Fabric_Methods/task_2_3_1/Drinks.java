public class Espresso implements Coffee {
    public double getCostPrice() { return 10.0; }
    public double getSalePrice() { return 25.0; }
    public String getName() { return "Espresso"; }
}

public class Americano implements Coffee {
    public double getCostPrice() { return 12.0; }
    public double getSalePrice() { return 30.0; }
    public String getName() { return "Americano"; }
}

public class Cappuccino implements Coffee {
    public double getCostPrice() { return 15.0; }
    public double getSalePrice() { return 35.0; }
    public String getName() { return "Cappuccino"; }
}

public class Latte implements Coffee {
    public double getCostPrice() { return 18.0; }
    public double getSalePrice() { return 40.0; }
    public String getName() { return "Latte"; }
}
