import java.util.Arrays;

public class TVSimulator {
    public static void main(String[] args) {
        Device tv    = new Television();
        Device radio = new Radio();

        RemoteController tvController = new RemoteController();
        tvController.setOnCommand(new TurnOnCommand(tv));
        tvController.setOffCommand(new TurnOffCommand(tv));
        tvController.setVolumeUpCommand(new VolumeUpCommand(tv));
        tvController.setVolumeDownCommand(new VolumeDownCommand(tv));
        tvController.setNextChannelCommand(new NextChannelCommand(tv));
        tvController.setPrevChannelCommand(new PrevChannelCommand(tv));

        RemoteController radioController = new RemoteController();
        radioController.setOnCommand(new TurnOnCommand(radio));
        radioController.setOffCommand(new TurnOffCommand(radio));
        radioController.setVolumeUpCommand(new VolumeUpCommand(radio));
        radioController.setVolumeDownCommand(new VolumeDownCommand(radio));
        radioController.setNextChannelCommand(new NextChannelCommand(radio));
        radioController.setPrevChannelCommand(new PrevChannelCommand(radio));

        CompositeOffCommand allOff =
            new CompositeOffCommand(Arrays.asList(
                new TurnOffCommand(tv),
                new TurnOffCommand(radio)
            ));
        RemoteController universal = new RemoteController();
        universal.setOffCommand(allOff);

        tvController.deviceOn();
        for (int i = 0; i < 3; i++) {
            tvController.deviceNextChanel();
        }
        tvController.deviceVolumeUp();
        tvController.deviceOff();

        System.out.println("-- RADIO --");
        radioController.deviceOn();
        radioController.deviceNextChanel();
        radioController.deviceVolumeUp();

        System.out.println("-- UNIVERSAL OFF --");
        universal.deviceOff();
    }
}
