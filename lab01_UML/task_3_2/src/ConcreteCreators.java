class ConcreteCreator1 extends Creator {
    @Override
    Product createProduct() {
        return new Product1();
    }
}

class ConcreteCreator2 extends Creator {
    @Override
    Product createProduct() {
        return new Product2();
    }
}
