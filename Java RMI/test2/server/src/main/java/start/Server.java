package start;

import services.PriceService;
import services.TaxService;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String args[]) {
        try {
            Registry registry = LocateRegistry.createRegistry(5099);
            registry.rebind("priceService", new PriceService());
            registry.rebind("taxService", new TaxService());
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("start.Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
