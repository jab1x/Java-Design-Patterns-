public class SkodaFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new Bus("Skoda", 4500000, 25);
    }
    
    @Override
    public Tram createTram() {
        return new Tram("Skoda", 9000000, 8);
    }
    
    @Override
    public Trolleybus createTrolleybus() {
        return new Trolleybus("Skoda", 6800000, 12);
    }
}
