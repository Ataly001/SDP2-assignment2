package assignment.gui;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering macOS button: " +
                "Confirm delivery");
    }
}