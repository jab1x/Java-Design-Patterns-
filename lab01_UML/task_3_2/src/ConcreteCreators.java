public class ConcreteCreator1 extends Creator {
    @Override
    Product createProduct() {
        return new Product1();
    }
}

public class ConcreteCreator2 extends Creator {
    @Override
    Product createProduct() {
        return new Product2();
    }
}
