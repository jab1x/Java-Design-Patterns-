public class HyundaiFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new Bus("Hyundai", 5500000, 20);
    }
    
    @Override
    public Tram createTram() {
        return new Tram("Hyundai", 9500000, 6);
    }
    
    @Override
    public Trolleybus createTrolleybus() {
        return new Trolleybus("Hyundai", 7000000, 11);
    }
}
