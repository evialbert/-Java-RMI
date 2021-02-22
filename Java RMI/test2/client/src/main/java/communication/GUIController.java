package communication;

import entities.Car;
import serviceInterfaces.IPriceService;
import serviceInterfaces.ITaxService;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

public class GUIController {

    private GUI gui;

    public GUIController() {
        gui =  new GUI();
        gui.setVisible(true);
    }

    public void setupControl() {
        gui.getSubmitBtn().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String year = gui.getYearField().getText();
                String engine = gui.getEngineField().getText();
                String price = gui.getPriceField().getText();
                Car car = new Car (Integer.parseInt(year), Integer.parseInt(engine), Double.parseDouble(price));
                try {
                    IPriceService priceService = (IPriceService) Naming.lookup("rmi://localhost:5099/priceService");
                    double finalPrice = priceService.computePrice(car);
                    ITaxService taxService = (ITaxService) Naming.lookup("rmi://localhost:5099/taxService");
                    double tax = taxService.computeTax(car);
                    gui.getResultsArea().setText("Price: " + finalPrice + "\n Tax: " + tax);
                } catch (Exception ex) {
                    System.err.println("Client exception: " + ex.toString());
                    ex.printStackTrace();
                }
            }
        });
    }
}
