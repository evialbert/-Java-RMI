package serviceInterfaces;

import entities.Car;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPriceService extends Remote {
    double computePrice(Car c) throws RemoteException;
}