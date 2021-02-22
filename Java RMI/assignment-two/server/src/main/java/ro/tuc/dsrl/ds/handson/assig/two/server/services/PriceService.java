package ro.tuc.dsrl.ds.handson.assig.two.server.services;

import ro.tuc.dsrl.ds.handson.assig.two.common.entities.Car;
import ro.tuc.dsrl.ds.handson.assig.two.common.serviceinterfaces.IPriceService;

public class PriceService implements IPriceService {

    @Override
    public double computePrice(Car c) {
        if(2018 - c.getYear() < 7)
            return c.getPrice() - (c.getPrice() * (2018 - c.getYear())/7);
        return 0;
    }
}
