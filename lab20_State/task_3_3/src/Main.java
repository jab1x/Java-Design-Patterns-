public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnUp();    // з low → medium,  "Fan is on medium"
        fan.turnUp();    // з medium → high,  "Fan is on high"
        fan.turnDown();  // з high → medium,  "Fan is on medium"
        fan.turnDown();  // з medium → low, "Fan is on low"
        fan.turnUp();    // з low → medium, "Fan is on medium"
    }
}
