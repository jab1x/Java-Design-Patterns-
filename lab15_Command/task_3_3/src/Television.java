public class Television implements Device {
    private int volume = 50;
    private int chanel = 1;
    private boolean isOn = false;

    @Override
    public void on() {
        if (isOn) return;
        System.out.println("Television is on");
        isOn = true;
    }

    @Override
    public void off() {
        if (!isOn) return;
        System.out.println("Television is off");
        isOn = false;
    }

    @Override
    public void volumeUp() {
        if (!isOn) return;
        volume++;
        System.out.println("TV Volume = " + volume);
    }

    @Override
    public void volumeDown() {
        if (!isOn) return;
        volume--;
        System.out.println("TV Volume = " + volume);
    }

    @Override
    public void nextChanel() {
        if (!isOn) return;
        chanel++;
        System.out.println("TV Chanel = " + chanel);
    }

    @Override
    public void prevChanel() {
        if (!isOn) return;
        chanel--;
        System.out.println("TV Chanel = " + chanel);
    }
}
