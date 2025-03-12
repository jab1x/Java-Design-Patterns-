public class Canvas {
    public static void main(String[] args) {
        System.out.println("=== Drawing Buttons ===\n");

        Button checkboxButton = new CheckboxButton(new SmallSize());
        Button radioButton = new RadioButton(new MediumSize());
        Button dropdownButton = new DropdownButton(new LargeSize());

        Button imageButtonCustom = new ImageButton(new UserSize(150, 80));

        Button[] buttons = { checkboxButton, radioButton, dropdownButton, imageButtonCustom };

        for (Button button : buttons) {
            button.draw();
        }
    }
}
