package services;

import entities.Car;
import serviceInterfaces.IPriceService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PriceService extends UnicastRemoteObject implements IPriceService {

    public PriceService() throws RemoteException {
        super();
    }

    public double computePrice(Car c) throws RemoteException {
        if(2018 - c.getYear() < 7)
            return c.getPrice() - (c.getPrice() * (2018 - c.getYear())/7);
        return 0;
    }
}
