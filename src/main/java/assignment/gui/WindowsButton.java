package assignment.gui;
public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering Windows button: " +
                "[Confirm Sweet Beverage Order]");
    }
}