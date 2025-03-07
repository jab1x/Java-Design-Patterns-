public class BoschFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new Bosch();
    }
}
