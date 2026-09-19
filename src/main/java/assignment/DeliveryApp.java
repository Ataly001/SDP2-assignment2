package assignment;

import assignment.gui.*;
import assignment.logistics.*;

public class DeliveryApp {
    private final Logistics logistics;
    private final Button button;
    private final Checkbox checkbox;

    public DeliveryApp(GUIFactory guiFactory, Logistics logistics) {
        this.logistics = logistics;
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }

    public void run(String cargo, String destination) {
        button.paint();
        checkbox.paint();
        logistics.planDelivery(cargo, destination);
    }
}