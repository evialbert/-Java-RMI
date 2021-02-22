package services;

import entities.Car;
import serviceInterfaces.ITaxService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class TaxService extends UnicastRemoteObject implements ITaxService {

    public TaxService() throws RemoteException {
        super();
    }

    public double computeTax(Car c) throws RemoteException {
        if (c.getEngineCapacity() <= 0) {
            throw new IllegalArgumentException("Engine capacity must be positive.");
        }
        int sum = 8;
        if(c.getEngineCapacity() > 1601) sum = 18;
        if(c.getEngineCapacity() > 2001) sum = 72;
        if(c.getEngineCapacity() > 2601) sum = 144;
        if(c.getEngineCapacity() > 3001) sum = 290;
        return c.getEngineCapacity() / 200.0 * sum;
    }
}
