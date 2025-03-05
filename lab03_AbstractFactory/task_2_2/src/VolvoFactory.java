class VolvoFactory implements TransportFactory {
    @Override
    public Bus createBus() {
        return new Bus("Volvo", 6000000, 20);
    }
    
    @Override
    public Tram createTram() {
        return new Tram("Volvo", 10000000, 7);
    }
    
    @Override
    public Trolleybus createTrolleybus() {
        return new Trolleybus("Volvo", 7000000, 13);
    }
}
