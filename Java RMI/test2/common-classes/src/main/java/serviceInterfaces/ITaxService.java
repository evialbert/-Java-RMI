package serviceInterfaces;

import entities.Car;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITaxService extends Remote {
    double computeTax(Car c) throws RemoteException;
}
