package communication;

import java.rmi.Naming;

import entities.Car;
import serviceInterfaces.IPriceService;
import serviceInterfaces.ITaxService;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        GUIController controller = new GUIController();
        controller.setupControl();
    }
}