public class Main {
    public static void main(String[] args) {
        Beverage b1 = new SugarDecorator(
                         new SugarDecorator(
                           new Espresso()));
        System.out.println(b1.description() + " = $" 
            + String.format("%.2f", b1.cost()));

        Beverage b2 = new SugarDecorator(
                         new SugarDecorator(
                           new WhippedCreamDecorator(
                             new DarkRoast())));
        System.out.println(b2.description() + " = $" 
            + String.format("%.2f", b2.cost()));

        Beverage b3 = new SugarDecorator(
                         new CreamDecorator(
                           new DarkRoast()));
        System.out.println(b3.description() + " = $" 
            + String.format("%.2f", b3.cost()));

        Beverage b4 = new SugarDecorator(
                         new SugarDecorator(
                           new MilkDecorator(
                             new Decaf())));
        System.out.println(b4.description() + " = $" 
            + String.format("%.2f", b4.cost()));
    }
}
