class PhilipsFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new Philips();
    }
}
