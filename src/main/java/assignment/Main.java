package assignment;

import assignment.gui.*;
import assignment.logistics.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String delivType;
        String ui;

        if (args.length >= 2) {
            delivType = args[0];
            ui = args[1];
        } else if (args.length == 1) {
            System.err.println("Error: Missing arguments: " +
                    "Enter delivery type and platform .");
            return;
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter delivery type - ROAD || SEA: ");
            delivType = scanner.next();

            System.out.print("Enter UI platform - WINDOWS || MACOS: ");
            ui = scanner.next();
        }
        delivType = delivType.toUpperCase();
        ui = ui.toUpperCase();

        Logistics logistics;
        switch (delivType) {
            case "ROAD":
                logistics = new RoadLogistics();
                break;
            case "SEA":
                logistics = new SeaLogistics();
                break;
            default:
                System.err.println("Error: Invalid delivery type '" + delivType + "'. " +
                        "Use ROAD || SEA.");
                return;
        }

        GUIFactory factory;
        switch (ui) {
            case "WINDOWS":
                factory = new WindowsFactory();
                break;
            case "MACOS":
                factory = new MacOSFactory();
                break;
            default:
                System.err.println("Error: Invalid platform '" + ui + "'. " +
                        "Use WINDOWS || MACOS.");
                return;
        }
        System.out.println("Selected delivery: " + delivType);
        System.out.println("Selected UI: " + ui);

        DeliveryApp app = new DeliveryApp(factory, logistics);
        app.run("Playstation 6", "Shakhterov 60");
    }
}