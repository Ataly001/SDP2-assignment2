package assignment.logistics;

public class Ship implements Transport {
    @Override
    public void deliver(String cargo, String destination) {
        System.out.println("Ship delivers cargo-[" + cargo + "] "
                + "to " + destination);
    }
}