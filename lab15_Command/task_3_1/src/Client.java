import java.util.List;

public class Client {
    public static void main(String[] args) {
        Lamp kitchen  = new Lamp("Kitchen");
        Lamp hall     = new Lamp("Hall");
        Lamp bedroom  = new Lamp("Bedroom");
        Lamp bathroom = new Lamp("Bathroom");

        RemoteControl kitchenRemote = new RemoteControl();
        kitchenRemote.setCommands(
            new TurnOnCommand(kitchen),
            new TurnOffCommand(kitchen)
        );

        RemoteControl hallRemote = new RemoteControl();
        hallRemote.setCommands(
            new TurnOnCommand(hall),
            new TurnOffCommand(hall)
        );


        RemoteControl universal = new RemoteControl();
        List<Lamp> all = Lamp.getAllLamps();
        universal.setCommands(
            () -> all.forEach(Lamp::lightOn),   
            new AllOffCommand(all)
        );

        // Симуляція
        kitchenRemote.pressOn();
        hallRemote.pressOn();
        kitchenRemote.pressOff();
        universal.pressOff();    
    }
}
