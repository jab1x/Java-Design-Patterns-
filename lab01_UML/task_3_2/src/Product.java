interface Product {
    void doSomething();
}

class Product1 implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product1 is doing something");
    }
}

class Product2 implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product2 is doing something");
    }
}
