class DeLonghiFactory implements CoffeeMachineFactory {
    @Override
    public CoffeeMachine createCoffeeMachine() {
        return new DeLonghi();
    }
}
