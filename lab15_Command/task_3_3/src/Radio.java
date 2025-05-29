public class Radio implements Device {
    private int volume = 30;
    private int chanel = 88;
    private boolean isOn = false;

    @Override
    public void on() {
        if (isOn) return;
        System.out.println("Radio is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) return;
        System.out.println("Radio is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) return;
        volume++;
        System.out.println("Radio Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) return;
        volume--;
        System.out.println("Radio Volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) return;
        chanel++;
        System.out.println("Radio Frequency = " + chanel + " MHz");
    }

    @Override
    public void prevChanel() {
        if (!isOn) return;
        chanel--;
        System.out.println("Radio Frequency = " + chanel + " MHz");
    }
}
