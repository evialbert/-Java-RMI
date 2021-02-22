package ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces;

import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;

public interface IPriceService {
    /**
     * Computes the price to be payed for a Car.
     *
     * @param c Car for which to compute the price
     * @return price for the car
     */
    double computePrice(Car c);
}
